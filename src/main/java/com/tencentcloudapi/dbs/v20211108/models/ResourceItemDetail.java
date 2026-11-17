/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceItemDetail extends AbstractModel {

    /**
    * <p>当前存储状态。可能的取值为："standard" - 标准存储；"lowFrequency" - 低频存储；"archive" - 归档存储；"deepArchive" - 深度归档存储；</p>
    */
    @SerializedName("TieredType")
    @Expose
    private String TieredType;

    /**
    * <p>存储时长。备份集已保留的时长，单位为小时。</p>
    */
    @SerializedName("StayTime")
    @Expose
    private Float StayTime;

    /**
     * Get <p>当前存储状态。可能的取值为："standard" - 标准存储；"lowFrequency" - 低频存储；"archive" - 归档存储；"deepArchive" - 深度归档存储；</p> 
     * @return TieredType <p>当前存储状态。可能的取值为："standard" - 标准存储；"lowFrequency" - 低频存储；"archive" - 归档存储；"deepArchive" - 深度归档存储；</p>
     */
    public String getTieredType() {
        return this.TieredType;
    }

    /**
     * Set <p>当前存储状态。可能的取值为："standard" - 标准存储；"lowFrequency" - 低频存储；"archive" - 归档存储；"deepArchive" - 深度归档存储；</p>
     * @param TieredType <p>当前存储状态。可能的取值为："standard" - 标准存储；"lowFrequency" - 低频存储；"archive" - 归档存储；"deepArchive" - 深度归档存储；</p>
     */
    public void setTieredType(String TieredType) {
        this.TieredType = TieredType;
    }

    /**
     * Get <p>存储时长。备份集已保留的时长，单位为小时。</p> 
     * @return StayTime <p>存储时长。备份集已保留的时长，单位为小时。</p>
     */
    public Float getStayTime() {
        return this.StayTime;
    }

    /**
     * Set <p>存储时长。备份集已保留的时长，单位为小时。</p>
     * @param StayTime <p>存储时长。备份集已保留的时长，单位为小时。</p>
     */
    public void setStayTime(Float StayTime) {
        this.StayTime = StayTime;
    }

    public ResourceItemDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceItemDetail(ResourceItemDetail source) {
        if (source.TieredType != null) {
            this.TieredType = new String(source.TieredType);
        }
        if (source.StayTime != null) {
            this.StayTime = new Float(source.StayTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TieredType", this.TieredType);
        this.setParamSimple(map, prefix + "StayTime", this.StayTime);

    }
}

