package br.unifor.so.escalonador.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import br.unifor.so.escalonador.Principal;
import br.unifor.so.escalonador.algoritmo.FIFO;
import br.unifor.so.escalonador.algoritmo.NFIFO;
import br.unifor.so.escalonador.algoritmo.RR;
import br.unifor.so.escalonador.algoritmo.SJF;
import br.unifor.so.escalonador.algoritmo.SRT;
import br.unifor.so.escalonador.model.Processo;

public class BotaoNovoProcesso implements ActionListener {

	@Override
	@SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent e) {
		switch (Principal.algoritmoENUM.getId()) {
		case 1:
			FIFO fifo = new FIFO();
			fifo.criarProcessos();
			fifo.montarProcessos();
			break;
		case 2:
			SJF sjf = new SJF();
			sjf.criarProcessos();
			sjf.montarProcessos();
			break;
		case 3:
			RR rr = new RR();
			rr.criarProcessos();
			rr.montarProcessos();
			break;
		case 4:
			NFIFO nfifo = new NFIFO();
			nfifo.criarProcessos();
			Principal.processosEmExecucao = new ArrayList<Processo>();
			nfifo.montarNucleos();
			nfifo.montarPrecessos();
			break;
		case 5:
			SRT srt = new SRT();
			srt.criarProcessos();
			Principal.processosEmExecucao = new ArrayList<Processo>();
			srt.montarNucleos();
			srt.montarProcessos();
			break;
		}
	}
}