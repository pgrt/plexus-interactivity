package org.codehaus.plexus.components.interactivity;

/*
 * The MIT License
 *
 * Copyright (c) 2005, The Codehaus
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import java.util.List;
import java.io.IOException;

/**
 * Manage user input from different sources.
 *
 * TODO should this also echo any prompts before the input?
 * TODO should this validate the input, reprompt if required?
 * TODO readBoolean, readInt, readSingleChar - readLine's that parse the input
 * @author <a href="mailto:brett@apache.org">Brett Porter</a>
 * @version $Id$
 */
public interface InputHandler
{
    String ROLE = InputHandler.class.getName();

    /**
     * Read a single line of input, swalling the newline at the end.
     * If the input can be echoed, it will be.
     * @return the line read
     */
    String readLine()
        throws IOException;

    /**
     * Read a single line of input, swalling the newline at the end.
     * This method guarantees input is not echoed.
     * @return the line read
     */
    String readPassword()
        throws IOException;

    /**
     * Read a set of lines. Equivalent to multiple calls to {@link #readLine()}.
     * Ends when an empty line is encountered.
     * @return a list of lines read
     */
    List<String> readMultipleLines()
        throws IOException;
}
