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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStreamPackageSSAIChannelRequest extends AbstractModel {

    /**
    * 广告插入配置名称，全局唯一，不能与其他频道重复。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 通配广告源地址。
    */
    @SerializedName("ContentSource")
    @Expose
    private String ContentSource;

    /**
    * 广告插入配置信息。
    */
    @SerializedName("SSAIInfo")
    @Expose
    private SSAIConf SSAIInfo;

    /**
    * 广告插入配置ID。
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
     * Get 广告插入配置名称，全局唯一，不能与其他频道重复。 
     * @return Name 广告插入配置名称，全局唯一，不能与其他频道重复。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 广告插入配置名称，全局唯一，不能与其他频道重复。
     * @param Name 广告插入配置名称，全局唯一，不能与其他频道重复。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 通配广告源地址。 
     * @return ContentSource 通配广告源地址。
     */
    public String getContentSource() {
        return this.ContentSource;
    }

    /**
     * Set 通配广告源地址。
     * @param ContentSource 通配广告源地址。
     */
    public void setContentSource(String ContentSource) {
        this.ContentSource = ContentSource;
    }

    /**
     * Get 广告插入配置信息。 
     * @return SSAIInfo 广告插入配置信息。
     */
    public SSAIConf getSSAIInfo() {
        return this.SSAIInfo;
    }

    /**
     * Set 广告插入配置信息。
     * @param SSAIInfo 广告插入配置信息。
     */
    public void setSSAIInfo(SSAIConf SSAIInfo) {
        this.SSAIInfo = SSAIInfo;
    }

    /**
     * Get 广告插入配置ID。 
     * @return ID 广告插入配置ID。
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 广告插入配置ID。
     * @param ID 广告插入配置ID。
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    public ModifyStreamPackageSSAIChannelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamPackageSSAIChannelRequest(ModifyStreamPackageSSAIChannelRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContentSource != null) {
            this.ContentSource = new String(source.ContentSource);
        }
        if (source.SSAIInfo != null) {
            this.SSAIInfo = new SSAIConf(source.SSAIInfo);
        }
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContentSource", this.ContentSource);
        this.setParamObj(map, prefix + "SSAIInfo.", this.SSAIInfo);
        this.setParamSimple(map, prefix + "ID", this.ID);

    }
}

