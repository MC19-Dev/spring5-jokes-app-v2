package ro.spring.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author MC19
 */
@Service
public class QuoteServiceImpl implements QuoteService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public QuoteServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
