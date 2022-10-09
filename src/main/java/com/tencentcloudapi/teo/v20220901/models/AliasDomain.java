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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AliasDomain extends AbstractModel{

    /**
    * 别称域名 ID。
    */
    @SerializedName("AliasId")
    @Expose
    private String AliasId;

    /**
    * 别称域名名称。
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 目标域名名称。
    */
    @SerializedName("TargetName")
    @Expose
    private String TargetName;

    /**
    * 别称域名状态，取值有：
<li> active：已生效； </li>
<li> pending：未生效；</li>
<li> not_filed：未备案；</li>
<li> conflict：被找回。 </li>
<li> stop：已停用；</li>
<li> deleted：已删除。 </li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 别称域名创建时间。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 别称域名修改时间。
    */
    @SerializedName("ModifiedOn")
    @Expose
    private String ModifiedOn;

    /**
     * Get 别称域名 ID。 
     * @return AliasId 别称域名 ID。
     */
    public String getAliasId() {
        return this.AliasId;
    }

    /**
     * Set 别称域名 ID。
     * @param AliasId 别称域名 ID。
     */
    public void setAliasId(String AliasId) {
        this.AliasId = AliasId;
    }

    /**
     * Get 别称域名名称。 
     * @return AliasName 别称域名名称。
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 别称域名名称。
     * @param AliasName 别称域名名称。
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 目标域名名称。 
     * @return TargetName 目标域名名称。
     */
    public String getTargetName() {
        return this.TargetName;
    }

    /**
     * Set 目标域名名称。
     * @param TargetName 目标域名名称。
     */
    public void setTargetName(String TargetName) {
        this.TargetName = TargetName;
    }

    /**
     * Get 别称域名状态，取值有：
<li> active：已生效； </li>
<li> pending：未生效；</li>
<li> not_filed：未备案；</li>
<li> conflict：被找回。 </li>
<li> stop：已停用；</li>
<li> deleted：已删除。 </li> 
     * @return Status 别称域名状态，取值有：
<li> active：已生效； </li>
<li> pending：未生效；</li>
<li> not_filed：未备案；</li>
<li> conflict：被找回。 </li>
<li> stop：已停用；</li>
<li> deleted：已删除。 </li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 别称域名状态，取值有：
<li> active：已生效； </li>
<li> pending：未生效；</li>
<li> not_filed：未备案；</li>
<li> conflict：被找回。 </li>
<li> stop：已停用；</li>
<li> deleted：已删除。 </li>
     * @param Status 别称域名状态，取值有：
<li> active：已生效； </li>
<li> pending：未生效；</li>
<li> not_filed：未备案；</li>
<li> conflict：被找回。 </li>
<li> stop：已停用；</li>
<li> deleted：已删除。 </li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 别称域名创建时间。 
     * @return CreatedOn 别称域名创建时间。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 别称域名创建时间。
     * @param CreatedOn 别称域名创建时间。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 别称域名修改时间。 
     * @return ModifiedOn 别称域名修改时间。
     */
    public String getModifiedOn() {
        return this.ModifiedOn;
    }

    /**
     * Set 别称域名修改时间。
     * @param ModifiedOn 别称域名修改时间。
     */
    public void setModifiedOn(String ModifiedOn) {
        this.ModifiedOn = ModifiedOn;
    }

    public AliasDomain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AliasDomain(AliasDomain source) {
        if (source.AliasId != null) {
            this.AliasId = new String(source.AliasId);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.TargetName != null) {
            this.TargetName = new String(source.TargetName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.ModifiedOn != null) {
            this.ModifiedOn = new String(source.ModifiedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AliasId", this.AliasId);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "TargetName", this.TargetName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "ModifiedOn", this.ModifiedOn);

    }
}

