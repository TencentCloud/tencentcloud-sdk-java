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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPathProtectionRuleRequest extends AbstractModel {

    /**
    * 路径保护规则ID
    */
    @SerializedName("PathProtectionRuleId")
    @Expose
    private Long PathProtectionRuleId;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 指定保护路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 规则状态（1：打开；2：关闭）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 路径保护规则ID 
     * @return PathProtectionRuleId 路径保护规则ID
     */
    public Long getPathProtectionRuleId() {
        return this.PathProtectionRuleId;
    }

    /**
     * Set 路径保护规则ID
     * @param PathProtectionRuleId 路径保护规则ID
     */
    public void setPathProtectionRuleId(Long PathProtectionRuleId) {
        this.PathProtectionRuleId = PathProtectionRuleId;
    }

    /**
     * Get 规则名称 
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 指定保护路径 
     * @return Path 指定保护路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 指定保护路径
     * @param Path 指定保护路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 规则状态（1：打开；2：关闭） 
     * @return Status 规则状态（1：打开；2：关闭）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态（1：打开；2：关闭）
     * @param Status 规则状态（1：打开；2：关闭）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ModifyPathProtectionRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPathProtectionRuleRequest(ModifyPathProtectionRuleRequest source) {
        if (source.PathProtectionRuleId != null) {
            this.PathProtectionRuleId = new Long(source.PathProtectionRuleId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PathProtectionRuleId", this.PathProtectionRuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

