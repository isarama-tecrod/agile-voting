package org.dominisoft.scrumdev.claro2020.domain.votes;

import org.dominisoft.scrumdev.claro2020.domain.DopNationalIdentificationNumber;

/**
 * @author jose anibal rodriguez
 */
public interface VotingService {

    boolean hasVoted(DopNationalIdentificationNumber number);

}
