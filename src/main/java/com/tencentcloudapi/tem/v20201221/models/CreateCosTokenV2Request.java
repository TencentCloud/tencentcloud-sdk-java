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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCosTokenV2Request extends AbstractModel{

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 包名
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * optType 1上传  2查询
    */
    @SerializedName("OptType")
    @Expose
    private Long OptType;

    /**
    * 来源 channel
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 充当deployVersion入参
    */
    @SerializedName("TimeVersion")
    @Expose
    private String TimeVersion;

    /**
     * Get 服务ID 
     * @return ServiceId 服务ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID
     * @param ServiceId 服务ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 包名 
     * @return PkgName 包名
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set 包名
     * @param PkgName 包名
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get optType 1上传  2查询 
     * @return OptType optType 1上传  2查询
     */
    public Long getOptType() {
        return this.OptType;
    }

    /**
     * Set optType 1上传  2查询
     * @param OptType optType 1上传  2查询
     */
    public void setOptType(Long OptType) {
        this.OptType = OptType;
    }

    /**
     * Get 来源 channel 
     * @return SourceChannel 来源 channel
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源 channel
     * @param SourceChannel 来源 channel
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get 充当deployVersion入参 
     * @return TimeVersion 充当deployVersion入参
     */
    public String getTimeVersion() {
        return this.TimeVersion;
    }

    /**
     * Set 充当deployVersion入参
     * @param TimeVersion 充当deployVersion入参
     */
    public void setTimeVersion(String TimeVersion) {
        this.TimeVersion = TimeVersion;
    }

    public CreateCosTokenV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCosTokenV2Request(CreateCosTokenV2Request source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.PkgName != null) {
            this.PkgName = new String(source.PkgName);
        }
        if (source.OptType != null) {
            this.OptType = new Long(source.OptType);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.TimeVersion != null) {
            this.TimeVersion = new String(source.TimeVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "OptType", this.OptType);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "TimeVersion", this.TimeVersion);

    }
}

