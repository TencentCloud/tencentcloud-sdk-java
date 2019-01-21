/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceDiskInfo  extends AbstractModel{

    /**
    * 平均每秒有百分之几的时间用于IO操作
    */
    @SerializedName("IoRatioPerSec")
    @Expose
    private Integer [] IoRatioPerSec;

    /**
    * 平均每次设备I/O操作的等待时间*100，单位为毫秒。例如：该值为201，表示平均每次I/O操作等待时间为：201/100=2.1毫秒
    */
    @SerializedName("IoWaitTime")
    @Expose
    private Integer [] IoWaitTime;

    /**
    * 磁盘平均每秒完成的读操作次数总和*100。例如：该值为2002，表示磁盘平均每秒完成读操作为：2002/100=20.2次
    */
    @SerializedName("Read")
    @Expose
    private Integer [] Read;

    /**
    * 磁盘平均每秒完成的写操作次数总和*100。例如：该值为30001，表示磁盘平均每秒完成写操作为：30001/100=300.01次
    */
    @SerializedName("Write")
    @Expose
    private Integer [] Write;

    /**
     * 获取平均每秒有百分之几的时间用于IO操作
     * @return IoRatioPerSec 平均每秒有百分之几的时间用于IO操作
     */
    public Integer [] getIoRatioPerSec() {
        return this.IoRatioPerSec;
    }

    /**
     * 设置平均每秒有百分之几的时间用于IO操作
     * @param IoRatioPerSec 平均每秒有百分之几的时间用于IO操作
     */
    public void setIoRatioPerSec(Integer [] IoRatioPerSec) {
        this.IoRatioPerSec = IoRatioPerSec;
    }

    /**
     * 获取平均每次设备I/O操作的等待时间*100，单位为毫秒。例如：该值为201，表示平均每次I/O操作等待时间为：201/100=2.1毫秒
     * @return IoWaitTime 平均每次设备I/O操作的等待时间*100，单位为毫秒。例如：该值为201，表示平均每次I/O操作等待时间为：201/100=2.1毫秒
     */
    public Integer [] getIoWaitTime() {
        return this.IoWaitTime;
    }

    /**
     * 设置平均每次设备I/O操作的等待时间*100，单位为毫秒。例如：该值为201，表示平均每次I/O操作等待时间为：201/100=2.1毫秒
     * @param IoWaitTime 平均每次设备I/O操作的等待时间*100，单位为毫秒。例如：该值为201，表示平均每次I/O操作等待时间为：201/100=2.1毫秒
     */
    public void setIoWaitTime(Integer [] IoWaitTime) {
        this.IoWaitTime = IoWaitTime;
    }

    /**
     * 获取磁盘平均每秒完成的读操作次数总和*100。例如：该值为2002，表示磁盘平均每秒完成读操作为：2002/100=20.2次
     * @return Read 磁盘平均每秒完成的读操作次数总和*100。例如：该值为2002，表示磁盘平均每秒完成读操作为：2002/100=20.2次
     */
    public Integer [] getRead() {
        return this.Read;
    }

    /**
     * 设置磁盘平均每秒完成的读操作次数总和*100。例如：该值为2002，表示磁盘平均每秒完成读操作为：2002/100=20.2次
     * @param Read 磁盘平均每秒完成的读操作次数总和*100。例如：该值为2002，表示磁盘平均每秒完成读操作为：2002/100=20.2次
     */
    public void setRead(Integer [] Read) {
        this.Read = Read;
    }

    /**
     * 获取磁盘平均每秒完成的写操作次数总和*100。例如：该值为30001，表示磁盘平均每秒完成写操作为：30001/100=300.01次
     * @return Write 磁盘平均每秒完成的写操作次数总和*100。例如：该值为30001，表示磁盘平均每秒完成写操作为：30001/100=300.01次
     */
    public Integer [] getWrite() {
        return this.Write;
    }

    /**
     * 设置磁盘平均每秒完成的写操作次数总和*100。例如：该值为30001，表示磁盘平均每秒完成写操作为：30001/100=300.01次
     * @param Write 磁盘平均每秒完成的写操作次数总和*100。例如：该值为30001，表示磁盘平均每秒完成写操作为：30001/100=300.01次
     */
    public void setWrite(Integer [] Write) {
        this.Write = Write;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IoRatioPerSec.", this.IoRatioPerSec);
        this.setParamArraySimple(map, prefix + "IoWaitTime.", this.IoWaitTime);
        this.setParamArraySimple(map, prefix + "Read.", this.Read);
        this.setParamArraySimple(map, prefix + "Write.", this.Write);

    }
}

