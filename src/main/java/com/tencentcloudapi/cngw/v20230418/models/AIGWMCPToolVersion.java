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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWMCPToolVersion extends AbstractModel {

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>创建者</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>是否生效</p>
    */
    @SerializedName("IsActive")
    @Expose
    private Boolean IsActive;

    /**
    * <p>总参数</p>
    */
    @SerializedName("TotalParam")
    @Expose
    private Long TotalParam;

    /**
    * <p>版本号</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>创建者</p> 
     * @return Creator <p>创建者</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建者</p>
     * @param Creator <p>创建者</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>是否生效</p> 
     * @return IsActive <p>是否生效</p>
     */
    public Boolean getIsActive() {
        return this.IsActive;
    }

    /**
     * Set <p>是否生效</p>
     * @param IsActive <p>是否生效</p>
     */
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    /**
     * Get <p>总参数</p> 
     * @return TotalParam <p>总参数</p>
     */
    public Long getTotalParam() {
        return this.TotalParam;
    }

    /**
     * Set <p>总参数</p>
     * @param TotalParam <p>总参数</p>
     */
    public void setTotalParam(Long TotalParam) {
        this.TotalParam = TotalParam;
    }

    /**
     * Get <p>版本号</p> 
     * @return Version <p>版本号</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>版本号</p>
     * @param Version <p>版本号</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public AIGWMCPToolVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWMCPToolVersion(AIGWMCPToolVersion source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.IsActive != null) {
            this.IsActive = new Boolean(source.IsActive);
        }
        if (source.TotalParam != null) {
            this.TotalParam = new Long(source.TotalParam);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "IsActive", this.IsActive);
        this.setParamSimple(map, prefix + "TotalParam", this.TotalParam);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

