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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeShiftWriteSizeData extends AbstractModel {

    /**
    * 区域。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 时间，格式为：yyyy-mm-ddTHH:MM:SSZ。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 写入量（单位：字节）
    */
    @SerializedName("WriteSize")
    @Expose
    private Float WriteSize;

    /**
    * 域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 时移天数。
    */
    @SerializedName("StorageDays")
    @Expose
    private Long StorageDays;

    /**
     * Get 区域。 
     * @return Area 区域。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 区域。
     * @param Area 区域。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 时间，格式为：yyyy-mm-ddTHH:MM:SSZ。 
     * @return Time 时间，格式为：yyyy-mm-ddTHH:MM:SSZ。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间，格式为：yyyy-mm-ddTHH:MM:SSZ。
     * @param Time 时间，格式为：yyyy-mm-ddTHH:MM:SSZ。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 写入量（单位：字节） 
     * @return WriteSize 写入量（单位：字节）
     */
    public Float getWriteSize() {
        return this.WriteSize;
    }

    /**
     * Set 写入量（单位：字节）
     * @param WriteSize 写入量（单位：字节）
     */
    public void setWriteSize(Float WriteSize) {
        this.WriteSize = WriteSize;
    }

    /**
     * Get 域名。 
     * @return Domain 域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名。
     * @param Domain 域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 时移天数。 
     * @return StorageDays 时移天数。
     */
    public Long getStorageDays() {
        return this.StorageDays;
    }

    /**
     * Set 时移天数。
     * @param StorageDays 时移天数。
     */
    public void setStorageDays(Long StorageDays) {
        this.StorageDays = StorageDays;
    }

    public TimeShiftWriteSizeData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeShiftWriteSizeData(TimeShiftWriteSizeData source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.WriteSize != null) {
            this.WriteSize = new Float(source.WriteSize);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StorageDays != null) {
            this.StorageDays = new Long(source.StorageDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "WriteSize", this.WriteSize);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StorageDays", this.StorageDays);

    }
}

