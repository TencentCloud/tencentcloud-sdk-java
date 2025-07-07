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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IOAUserGroup extends AbstractModel {

    /**
    * ioa用户组织id
    */
    @SerializedName("OrgId")
    @Expose
    private Long OrgId;

    /**
    * ioa用户组织名称
    */
    @SerializedName("OrgName")
    @Expose
    private String OrgName;

    /**
    * ioa用户组织id路径	
    */
    @SerializedName("OrgIdPath")
    @Expose
    private String OrgIdPath;

    /**
    * ioa用户组织名称路径	
    */
    @SerializedName("OrgNamePath")
    @Expose
    private String OrgNamePath;

    /**
    * ioa关联用户源类型
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
     * Get ioa用户组织id 
     * @return OrgId ioa用户组织id
     */
    public Long getOrgId() {
        return this.OrgId;
    }

    /**
     * Set ioa用户组织id
     * @param OrgId ioa用户组织id
     */
    public void setOrgId(Long OrgId) {
        this.OrgId = OrgId;
    }

    /**
     * Get ioa用户组织名称 
     * @return OrgName ioa用户组织名称
     */
    public String getOrgName() {
        return this.OrgName;
    }

    /**
     * Set ioa用户组织名称
     * @param OrgName ioa用户组织名称
     */
    public void setOrgName(String OrgName) {
        this.OrgName = OrgName;
    }

    /**
     * Get ioa用户组织id路径	 
     * @return OrgIdPath ioa用户组织id路径	
     */
    public String getOrgIdPath() {
        return this.OrgIdPath;
    }

    /**
     * Set ioa用户组织id路径	
     * @param OrgIdPath ioa用户组织id路径	
     */
    public void setOrgIdPath(String OrgIdPath) {
        this.OrgIdPath = OrgIdPath;
    }

    /**
     * Get ioa用户组织名称路径	 
     * @return OrgNamePath ioa用户组织名称路径	
     */
    public String getOrgNamePath() {
        return this.OrgNamePath;
    }

    /**
     * Set ioa用户组织名称路径	
     * @param OrgNamePath ioa用户组织名称路径	
     */
    public void setOrgNamePath(String OrgNamePath) {
        this.OrgNamePath = OrgNamePath;
    }

    /**
     * Get ioa关联用户源类型 
     * @return Source ioa关联用户源类型
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set ioa关联用户源类型
     * @param Source ioa关联用户源类型
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    public IOAUserGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IOAUserGroup(IOAUserGroup source) {
        if (source.OrgId != null) {
            this.OrgId = new Long(source.OrgId);
        }
        if (source.OrgName != null) {
            this.OrgName = new String(source.OrgName);
        }
        if (source.OrgIdPath != null) {
            this.OrgIdPath = new String(source.OrgIdPath);
        }
        if (source.OrgNamePath != null) {
            this.OrgNamePath = new String(source.OrgNamePath);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgId", this.OrgId);
        this.setParamSimple(map, prefix + "OrgName", this.OrgName);
        this.setParamSimple(map, prefix + "OrgIdPath", this.OrgIdPath);
        this.setParamSimple(map, prefix + "OrgNamePath", this.OrgNamePath);
        this.setParamSimple(map, prefix + "Source", this.Source);

    }
}

