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

public class DeviceDiskInfo extends AbstractModel{

    /**
    * 平均每秒有百分之几的时间用于IO操作
    */
    @SerializedName("IoRatioPerSec")
    @Expose
    private Long [] IoRatioPerSec;

    /**
    * 平均每次设备I/O操作的等待时间*100，单位为毫秒。例如：该值为201，表示平均每次I/O操作等待时间为：201/100=2.1毫秒
    */
    @SerializedName("IoWaitTime")
    @Expose
    private Long [] IoWaitTime;

    /**
    * 磁盘平均每秒完成的读操作次数总和*100。例如：该值为2002，表示磁盘平均每秒完成读操作为：2002/100=20.2次
    */
    @SerializedName("Read")
    @Expose
    private Long [] Read;

    /**
    * 磁盘平均每秒完成的写操作次数总和*100。例如：该值为30001，表示磁盘平均每秒完成写操作为：30001/100=300.01次
    */
    @SerializedName("Write")
    @Expose
    private Long [] Write;

    /**
     * Get 平均每秒有百分之几的时间用于IO操作 
     * @return IoRatioPerSec 平均每秒有百分之几的时间用于IO操作
     */
    public Long [] getIoRatioPerSec() {
        return this.IoRatioPerSec;
    }

    /**
     * Set 平均每秒有百分之几的时间用于IO操作
     * @param IoRatioPerSec 平均每秒有百分之几的时间用于IO操作
     */
    public void setIoRatioPerSec(Long [] IoRatioPerSec) {
        this.IoRatioPerSec = IoRatioPerSec;
    }

    /**
     * Get 平均每次设备I/O操作的等待时间*100，单位为毫秒。例如：该值为201，表示平均每次I/O操作等待时间为：201/100=2.1毫秒 
     * @return IoWaitTime 平均每次设备I/O操作的等待时间*100，单位为毫秒。例如：该值为201，表示平均每次I/O操作等待时间为：201/100=2.1毫秒
     */
    public Long [] getIoWaitTime() {
        return this.IoWaitTime;
    }

    /**
     * Set 平均每次设备I/O操作的等待时间*100，单位为毫秒。例如：该值为201，表示平均每次I/O操作等待时间为：201/100=2.1毫秒
     * @param IoWaitTime 平均每次设备I/O操作的等待时间*100，单位为毫秒。例如：该值为201，表示平均每次I/O操作等待时间为：201/100=2.1毫秒
     */
    public void setIoWaitTime(Long [] IoWaitTime) {
        this.IoWaitTime = IoWaitTime;
    }

    /**
     * Get 磁盘平均每秒完成的读操作次数总和*100。例如：该值为2002，表示磁盘平均每秒完成读操作为：2002/100=20.2次 
     * @return Read 磁盘平均每秒完成的读操作次数总和*100。例如：该值为2002，表示磁盘平均每秒完成读操作为：2002/100=20.2次
     */
    public Long [] getRead() {
        return this.Read;
    }

    /**
     * Set 磁盘平均每秒完成的读操作次数总和*100。例如：该值为2002，表示磁盘平均每秒完成读操作为：2002/100=20.2次
     * @param Read 磁盘平均每秒完成的读操作次数总和*100。例如：该值为2002，表示磁盘平均每秒完成读操作为：2002/100=20.2次
     */
    public void setRead(Long [] Read) {
        this.Read = Read;
    }

    /**
     * Get 磁盘平均每秒完成的写操作次数总和*100。例如：该值为30001，表示磁盘平均每秒完成写操作为：30001/100=300.01次 
     * @return Write 磁盘平均每秒完成的写操作次数总和*100。例如：该值为30001，表示磁盘平均每秒完成写操作为：30001/100=300.01次
     */
    public Long [] getWrite() {
        return this.Write;
    }

    /**
     * Set 磁盘平均每秒完成的写操作次数总和*100。例如：该值为30001，表示磁盘平均每秒完成写操作为：30001/100=300.01次
     * @param Write 磁盘平均每秒完成的写操作次数总和*100。例如：该值为30001，表示磁盘平均每秒完成写操作为：30001/100=300.01次
     */
    public void setWrite(Long [] Write) {
        this.Write = Write;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IoRatioPerSec.", this.IoRatioPerSec);
        this.setParamArraySimple(map, prefix + "IoWaitTime.", this.IoWaitTime);
        this.setParamArraySimple(map, prefix + "Read.", this.Read);
        this.setParamArraySimple(map, prefix + "Write.", this.Write);

    }
}

