package br.com.dbserver.assembleia.servico;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import br.com.dbserver.assembleia.entidade.Pauta;
import org.springframework.validation.annotation.Validated;

@Validated
public interface PautaService {

	Optional<Pauta> criar(@Valid Pauta pauta);

	Optional<Pauta> alterar(Long id, @Valid Pauta pauta);

	Optional<List<Pauta>> consultar(Optional<String> id, Optional<String> descricao, Optional<LocalDateTime> dtInicio,
			Optional<LocalDateTime> dtFim, Optional<Boolean> excluida);

	Optional<Pauta> consultarPorId(Long id);

	List<Pauta> consultarAsNaoFinalizadas();

	void excluir(Long id);

}
