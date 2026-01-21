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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Checklist extends AbstractModel {

    /**
    * 审查清单id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 审查清单名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 审查点数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 启用状态
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 修改人
    */
    @SerializedName("Updater")
    @Expose
    private String Updater;

    /**
    * 修改时间
    */
    @SerializedName("ModifiedOn")
    @Expose
    private Long ModifiedOn;

    /**
    * 是否官方清单
    */
    @SerializedName("Official")
    @Expose
    private Boolean Official;

    /**
    * 配置状态，[0(未配置), 1(已配置)]
    */
    @SerializedName("ConfigStatus")
    @Expose
    private Long ConfigStatus;

    /**
     * Get 审查清单id 
     * @return Id 审查清单id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 审查清单id
     * @param Id 审查清单id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 审查清单名称 
     * @return Name 审查清单名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 审查清单名称
     * @param Name 审查清单名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 审查点数量 
     * @return Count 审查点数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 审查点数量
     * @param Count 审查点数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 启用状态 
     * @return Enabled 启用状态
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 启用状态
     * @param Enabled 启用状态
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 修改人 
     * @return Updater 修改人
     */
    public String getUpdater() {
        return this.Updater;
    }

    /**
     * Set 修改人
     * @param Updater 修改人
     */
    public void setUpdater(String Updater) {
        this.Updater = Updater;
    }

    /**
     * Get 修改时间 
     * @return ModifiedOn 修改时间
     */
    public Long getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 修改时间
     * @param ModifiedOn 修改时间
     */
    public void setModifiedOn(Long ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    /**
     * Get 是否官方清单 
     * @return Official 是否官方清单
     */
    public Boolean getOfficial() {
        return this.Official;
    }

    /**
     * Set 是否官方清单
     * @param Official 是否官方清单
     */
    public void setOfficial(Boolean Official) {
        this.Official = Official;
    }

    /**
     * Get 配置状态，[0(未配置), 1(已配置)] 
     * @return ConfigStatus 配置状态，[0(未配置), 1(已配置)]
     */
    public Long getConfigStatus() {
        return this.ConfigStatus;
    }

    /**
     * Set 配置状态，[0(未配置), 1(已配置)]
     * @param ConfigStatus 配置状态，[0(未配置), 1(已配置)]
     */
    public void setConfigStatus(Long ConfigStatus) {
        this.ConfigStatus = ConfigStatus;
    }

    public Checklist() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Checklist(Checklist source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Updater != null) {
            this.Updater = new String(source.Updater);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new Long(source.ModifiedOn);
        }
        if (source.Official != null) {
            this.Official = new Boolean(source.Official);
        }
        if (source.ConfigStatus != null) {
            this.ConfigStatus = new Long(source.ConfigStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Updater", this.Updater);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);
        this.setParamSimple(map, prefix + "Official", this.Official);
        this.setParamSimple(map, prefix + "ConfigStatus", this.ConfigStatus);

    }
}

