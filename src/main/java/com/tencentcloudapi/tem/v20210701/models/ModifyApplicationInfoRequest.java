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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApplicationInfoRequest extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 是否开启调用链, 0 为关闭，1位开启
    */
    @SerializedName("EnableTracing")
    @Expose
    private Long EnableTracing;

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get 是否开启调用链, 0 为关闭，1位开启 
     * @return EnableTracing 是否开启调用链, 0 为关闭，1位开启
     */
    public Long getEnableTracing() {
        return this.EnableTracing;
    }

    /**
     * Set 是否开启调用链, 0 为关闭，1位开启
     * @param EnableTracing 是否开启调用链, 0 为关闭，1位开启
     */
    public void setEnableTracing(Long EnableTracing) {
        this.EnableTracing = EnableTracing;
    }

    public ModifyApplicationInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationInfoRequest(ModifyApplicationInfoRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.EnableTracing != null) {
            this.EnableTracing = new Long(source.EnableTracing);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "EnableTracing", this.EnableTracing);

    }
}

