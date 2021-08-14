package cs520.hw6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Test {
	public static void main(String[] args) {
		InputStreamReader inputStream = null;
		BufferedReader reader = null;

		try {
			URL urlObject = new URL("https://norvig.com/big.txt");

			StringBuffer data = new StringBuffer();
			String inputLine;

			inputStream = new InputStreamReader(urlObject.openStream());
			reader = new BufferedReader(inputStream);

			while ((inputLine = reader.readLine()) != null) {
				inputLine = inputLine.toLowerCase();
				data.append(inputLine + "\n");
			}

			SharedResults sharedResults = new SharedResults();
			char letter = 'a';

			System.out.println("Input Data Length: " + data.length());
			
			LongTask[] longTask = new LongTask[26];
			for (int i = 0; i < longTask.length; i++) {
				longTask[i] = new LongTask(sharedResults, data, letter);
				longTask[i].start();
				letter++;
			}
			for (int i = 0; i < longTask.length; i++) {
				longTask[i].join();
			}

			System.out.println("Alphabet Count = " + sharedResults.getResult());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e2) {
				// Exception closing stream or reader
				e2.printStackTrace();
			}
		}
	}
}

/* Output from the console:
Input Data Length: 6488666
Thread Thread_f running.
Thread Thread_b running.
Thread Thread_e running.
Thread Thread_d running.
Thread Thread_c running.
Thread Thread_g running.
Thread Thread_h running.
Thread Thread_a running.
Thread Thread_i running.
Thread Thread_j running.
Thread Thread_k running.
Thread Thread_l running.
Thread Thread_m running.
Thread Thread_n running.
Thread Thread_o running.
Thread Thread_p running.
Thread Thread_q running.
Thread Thread_r running.
Thread Thread_s running.
Thread Thread_t running.
Thread Thread_u running.
Thread Thread_v running.
Thread Thread_w running.
Thread Thread_x running.
Thread Thread_y running.
Thread Thread_z running.
Thread_u is adding <u, 138732>
Cumulative results are [<u, 138732>]
Thread_r is adding <r, 309555>
Cumulative results are [<u, 138732>, <r, 309555>]
Thread_m is adding <m, 127063>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>]
Thread_s is adding <s, 334897>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>]
Thread_l is adding <l, 198648>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>]
Thread_p is adding <p, 98913>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>]
Thread_b is adding <b, 73168>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>]
Thread_d is adding <d, 215706>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>]
Thread_q is adding <q, 4571>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>]
Thread_f is adding <f, 120875>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>]
Thread_k is adding <k, 32798>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>]
Thread_j is adding <j, 6436>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>]
Thread_n is adding <n, 369018>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>]
Thread_c is adding <c, 144972>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>]
Thread_a is adding <a, 408089>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>]
Thread_e is adding <e, 633818>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>, <e, 633818>]
Thread_g is adding <g, 96916>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>, <e, 633818>, <g, 96916>]
Thread_t is adding <t, 460741>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>, <e, 633818>, <g, 96916>, <t, 460741>]
Thread_o is adding <o, 386867>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>, <e, 633818>, <g, 96916>, <t, 460741>, <o, 386867>]
Thread_v is adding <v, 52378>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>, <e, 633818>, <g, 96916>, <t, 460741>, <o, 386867>, <v, 52378>]
Thread_i is adding <i, 365638>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>, <e, 633818>, <g, 96916>, <t, 460741>, <o, 386867>, <v, 52378>, <i, 365638>]
Thread_h is adding <h, 294681>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>, <e, 633818>, <g, 96916>, <t, 460741>, <o, 386867>, <v, 52378>, <i, 365638>, <h, 294681>]
Thread_x is adding <x, 9810>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>, <e, 633818>, <g, 96916>, <t, 460741>, <o, 386867>, <v, 52378>, <i, 365638>, <h, 294681>, <x, 9810>]
Thread_w is adding <w, 100831>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>, <e, 633818>, <g, 96916>, <t, 460741>, <o, 386867>, <v, 52378>, <i, 365638>, <h, 294681>, <x, 9810>, <w, 100831>]
Thread_y is adding <y, 90481>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>, <e, 633818>, <g, 96916>, <t, 460741>, <o, 386867>, <v, 52378>, <i, 365638>, <h, 294681>, <x, 9810>, <w, 100831>, <y, 90481>]
Thread_z is adding <z, 3796>
Cumulative results are [<u, 138732>, <r, 309555>, <m, 127063>, <s, 334897>, <l, 198648>, <p, 98913>, <b, 73168>, <d, 215706>, <q, 4571>, <f, 120875>, <k, 32798>, <j, 6436>, <n, 369018>, <c, 144972>, <a, 408089>, <e, 633818>, <g, 96916>, <t, 460741>, <o, 386867>, <v, 52378>, <i, 365638>, <h, 294681>, <x, 9810>, <w, 100831>, <y, 90481>, <z, 3796>]
Alphabet Count = 5079398
 */
