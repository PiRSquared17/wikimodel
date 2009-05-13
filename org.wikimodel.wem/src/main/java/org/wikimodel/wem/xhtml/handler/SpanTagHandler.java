/*******************************************************************************
 * Copyright (c) 2005,2006 Cognium Systems SA and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Cognium Systems SA - initial API and implementation
 *******************************************************************************/
package org.wikimodel.wem.xhtml.handler;

import org.wikimodel.wem.WikiParameters;
import org.wikimodel.wem.xhtml.impl.XhtmlHandler.TagStack.TagContext;

/**
 * @author vmassol
 */
public class SpanTagHandler extends TagHandler {
    
    public SpanTagHandler() {
        super(false, false, true);
    }

    @Override
    protected void begin(TagContext context) {
        if (context.getParams().getSize() > 0) {
            context.getScannerContext().beginFormat(context.getParams());
        }
    }

    @Override
    protected void end(TagContext context) {
        if (context.getParams().getSize() > 0) {
            context.getScannerContext().endFormat(WikiParameters.EMPTY);
        }
    }

}