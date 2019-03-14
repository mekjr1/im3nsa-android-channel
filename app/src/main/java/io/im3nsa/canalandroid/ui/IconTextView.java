/*
 * RapidPro Android Channel - Relay SMS messages where MNO connections aren't practical.
 * Copyright (C) 2014 Nyaruka, UNICEF
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.im3nsa.canalandroid.ui;

import android.content.Context;
import android.util.AttributeSet;

public class IconTextView extends UpdatingTextView {
    public IconTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(Typefaces.get(getContext(), "im3nsa.ttf"));
    }

    public void setIconColor(int color) {
        setTextColor(getResources().getColor(color));
    }
}
