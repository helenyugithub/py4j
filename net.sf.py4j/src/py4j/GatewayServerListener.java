/**
 * Copyright (c) 2009-2011, Barthelemy Dagenais All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * - Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 * 
 * - Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 * 
 * - The name of the author may not be used to endorse or promote products
 * derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package py4j;

/**
 * <p>
 * A client can implement this listener to be notified of Gateway events.
 * </p>
 * 
 * @author Barthelemy Dagenais
 *
 */
public interface GatewayServerListener {

	void serverStarted();
	
	/**
	 * <p>This method may be called concurrently with serverPostShutdown().</p>
	 * 
	 * <p>Typically a one thread calls shutdown() and then, the thread running the GatewayServer breaks from the connection accept loop.</p>
	 */
	void serverStopped();
	
	/**
	 * <p>This method may be called concurrently with serverPostShutdown().</p>
	 * 
	 * <p>Typically a one thread calls shutdown() and then, the thread running the GatewayServer breaks from the connection accept loop.</p>
	 */
	void serverError(Exception e);
	
	void serverPreShutdown();
	
	/**
	 * <p>This method may be called concurrently with serverStopped() and serverError().</p>
	 * 
	 * <p>Typically a one thread calls shutdown() and then, the thread running the GatewayServer breaks from the connection accept loop.</p>
	 */
	void serverPostShutdown();
	
	void connectionStarted();
	
	void connectionStopped();
	
	void connectionError(Exception e);
	
}
