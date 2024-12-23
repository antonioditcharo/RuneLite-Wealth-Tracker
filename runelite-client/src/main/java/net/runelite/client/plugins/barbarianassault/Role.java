/*
 * Copyright (c) 2018, Cameron <https://github.com/noremac201>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.barbarianassault;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.annotations.Component;

@AllArgsConstructor
@Getter
enum Role
{
	ATTACKER(ComponentID.BA_ATTACKER_ROLE, ComponentID.BA_ATTACKER_ROLE_SPRITE),
	DEFENDER(ComponentID.BA_DEFENDER_ROLE, ComponentID.BA_DEFENDER_ROLE_SPRITE),
	COLLECTOR(ComponentID.BA_COLLECTOR_ROLE, ComponentID.BA_COLLECTOR_ROLE_SPRITE),
	HEALER(ComponentID.BA_HEALER_ROLE, ComponentID.BA_HEALER_ROLE_SPRITE);

	@Component
	private final int roleText;
	@Component
	private final int roleSprite;

	@Override
	public String toString()
	{
		return name();
	}
}
