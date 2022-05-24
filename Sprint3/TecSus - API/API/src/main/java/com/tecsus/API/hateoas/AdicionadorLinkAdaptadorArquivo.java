package com.tecsus.API.hateoas;

import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

import com.tecsus.API.controller.ArquivoController;
import com.tecsus.API.upload.AdaptadorArquivo;


@Component
public class AdicionadorLinkAdaptadorArquivo implements AdicionadorLink<AdaptadorArquivo> {
	@Override
	public void adicionarLink(List<AdaptadorArquivo> lista) {
		for (AdaptadorArquivo arquivo : lista) {
			long id = arquivo.getId();
			Link linkProprio = WebMvcLinkBuilder
					.linkTo(WebMvcLinkBuilder
							.methodOn(ArquivoController.class)
							.obterArquivo(id))
					.withSelfRel();
			arquivo.add(linkProprio);
		}
	}

	@Override
	public void adicionarLink(AdaptadorArquivo arquivo) {
		Link linkLista = WebMvcLinkBuilder
				.linkTo(WebMvcLinkBuilder
						.methodOn(ArquivoController.class)
						.obterArquivos())
				.withRel("Lista de Arquivos");
		arquivo.add(linkLista);
	}
}