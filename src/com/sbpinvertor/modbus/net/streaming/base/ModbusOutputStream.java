package com.sbpinvertor.modbus.net.streaming.base;

import com.sbpinvertor.modbus.utils.DataUtils;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Copyright (c) 2015-2016 JSC "Zavod "Invertor"
 * [http://www.sbp-invertor.ru]
 * <p/>
 * This file is part of JLibModbus.
 * <p/>
 * JLibModbus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * <p/>
 * Authors: Vladislav Y. Kochedykov, software engineer.
 * email: vladislav.kochedykov@gmail.com
 */
abstract public class ModbusOutputStream extends OutputStream {

    abstract public void write(byte[] b) throws IOException;

    abstract public void write(int b) throws IOException;

    abstract public void flush() throws IOException;

    abstract public void reset();

    public void writeShortBE(int s) throws IOException {
        write(DataUtils.byteHigh(s));
        write(DataUtils.byteLow(s));
    }

    public void writeShortLE(int s) throws IOException {
        write(DataUtils.byteLow(s));
        write(DataUtils.byteHigh(s));
    }
}