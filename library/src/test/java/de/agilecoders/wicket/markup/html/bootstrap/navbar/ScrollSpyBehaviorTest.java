package de.agilecoders.wicket.markup.html.bootstrap.navbar;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Tests the {@link ScrollSpyBehavior} class
 *
 * @author miha
 * @version 1.0
 */
public class ScrollSpyBehaviorTest {

    @Test
    public void refreshScriptIsCorrect() {
        AjaxRequestTarget target = mock(AjaxRequestTarget.class);
        ScrollSpyBehavior.refresh(target);

        verify(target, times(1)).appendJavaScript("$('[data-spy=\"scroll\"]').each(function(){var $spy = $(this).scrollspy('refresh');});");
    }

}
