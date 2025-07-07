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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLicenseOrderRequest extends AbstractModel {

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 预期值,如果当前为10,扩容则输入原来大的值, 缩容则比原来小的值(缩容时不允许预期值比使用量小),如果保持不变则填写原值,
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
    * 项目ID,不修改则输入原值.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 资源别名,不修改则输入原值.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 预期值,如果当前为10,扩容则输入原来大的值, 缩容则比原来小的值(缩容时不允许预期值比使用量小),如果保持不变则填写原值, 
     * @return InquireNum 预期值,如果当前为10,扩容则输入原来大的值, 缩容则比原来小的值(缩容时不允许预期值比使用量小),如果保持不变则填写原值,
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set 预期值,如果当前为10,扩容则输入原来大的值, 缩容则比原来小的值(缩容时不允许预期值比使用量小),如果保持不变则填写原值,
     * @param InquireNum 预期值,如果当前为10,扩容则输入原来大的值, 缩容则比原来小的值(缩容时不允许预期值比使用量小),如果保持不变则填写原值,
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    /**
     * Get 项目ID,不修改则输入原值. 
     * @return ProjectId 项目ID,不修改则输入原值.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID,不修改则输入原值.
     * @param ProjectId 项目ID,不修改则输入原值.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 资源别名,不修改则输入原值. 
     * @return Alias 资源别名,不修改则输入原值.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 资源别名,不修改则输入原值.
     * @param Alias 资源别名,不修改则输入原值.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public ModifyLicenseOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLicenseOrderRequest(ModifyLicenseOrderRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

