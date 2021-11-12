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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNamespaceRequest extends AbstractModel{

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间描述
    */
    @SerializedName("NamespaceDesc")
    @Expose
    private String NamespaceDesc;

    /**
    * 命名空间资源类型(默认值为DEF)
    */
    @SerializedName("NamespaceResourceType")
    @Expose
    private String NamespaceResourceType;

    /**
    * 是否是全局命名空间(默认是DEF，表示普通命名空间；GLOBAL表示全局命名空间)
    */
    @SerializedName("NamespaceType")
    @Expose
    private String NamespaceType;

    /**
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 是否开启高可用
    */
    @SerializedName("IsHaEnable")
    @Expose
    private String IsHaEnable;

    /**
    * 需要绑定的数据集ID
    */
    @SerializedName("ProgramId")
    @Expose
    private String ProgramId;

    /**
    * 无
    */
    @SerializedName("ProgramIdList")
    @Expose
    private String [] ProgramIdList;

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 命名空间描述 
     * @return NamespaceDesc 命名空间描述
     */
    public String getNamespaceDesc() {
        return this.NamespaceDesc;
    }

    /**
     * Set 命名空间描述
     * @param NamespaceDesc 命名空间描述
     */
    public void setNamespaceDesc(String NamespaceDesc) {
        this.NamespaceDesc = NamespaceDesc;
    }

    /**
     * Get 命名空间资源类型(默认值为DEF) 
     * @return NamespaceResourceType 命名空间资源类型(默认值为DEF)
     */
    public String getNamespaceResourceType() {
        return this.NamespaceResourceType;
    }

    /**
     * Set 命名空间资源类型(默认值为DEF)
     * @param NamespaceResourceType 命名空间资源类型(默认值为DEF)
     */
    public void setNamespaceResourceType(String NamespaceResourceType) {
        this.NamespaceResourceType = NamespaceResourceType;
    }

    /**
     * Get 是否是全局命名空间(默认是DEF，表示普通命名空间；GLOBAL表示全局命名空间) 
     * @return NamespaceType 是否是全局命名空间(默认是DEF，表示普通命名空间；GLOBAL表示全局命名空间)
     */
    public String getNamespaceType() {
        return this.NamespaceType;
    }

    /**
     * Set 是否是全局命名空间(默认是DEF，表示普通命名空间；GLOBAL表示全局命名空间)
     * @param NamespaceType 是否是全局命名空间(默认是DEF，表示普通命名空间；GLOBAL表示全局命名空间)
     */
    public void setNamespaceType(String NamespaceType) {
        this.NamespaceType = NamespaceType;
    }

    /**
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 是否开启高可用 
     * @return IsHaEnable 是否开启高可用
     */
    public String getIsHaEnable() {
        return this.IsHaEnable;
    }

    /**
     * Set 是否开启高可用
     * @param IsHaEnable 是否开启高可用
     */
    public void setIsHaEnable(String IsHaEnable) {
        this.IsHaEnable = IsHaEnable;
    }

    /**
     * Get 需要绑定的数据集ID 
     * @return ProgramId 需要绑定的数据集ID
     */
    public String getProgramId() {
        return this.ProgramId;
    }

    /**
     * Set 需要绑定的数据集ID
     * @param ProgramId 需要绑定的数据集ID
     */
    public void setProgramId(String ProgramId) {
        this.ProgramId = ProgramId;
    }

    /**
     * Get 无 
     * @return ProgramIdList 无
     */
    public String [] getProgramIdList() {
        return this.ProgramIdList;
    }

    /**
     * Set 无
     * @param ProgramIdList 无
     */
    public void setProgramIdList(String [] ProgramIdList) {
        this.ProgramIdList = ProgramIdList;
    }

    public CreateNamespaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNamespaceRequest(CreateNamespaceRequest source) {
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceDesc != null) {
            this.NamespaceDesc = new String(source.NamespaceDesc);
        }
        if (source.NamespaceResourceType != null) {
            this.NamespaceResourceType = new String(source.NamespaceResourceType);
        }
        if (source.NamespaceType != null) {
            this.NamespaceType = new String(source.NamespaceType);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.IsHaEnable != null) {
            this.IsHaEnable = new String(source.IsHaEnable);
        }
        if (source.ProgramId != null) {
            this.ProgramId = new String(source.ProgramId);
        }
        if (source.ProgramIdList != null) {
            this.ProgramIdList = new String[source.ProgramIdList.length];
            for (int i = 0; i < source.ProgramIdList.length; i++) {
                this.ProgramIdList[i] = new String(source.ProgramIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceDesc", this.NamespaceDesc);
        this.setParamSimple(map, prefix + "NamespaceResourceType", this.NamespaceResourceType);
        this.setParamSimple(map, prefix + "NamespaceType", this.NamespaceType);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "IsHaEnable", this.IsHaEnable);
        this.setParamSimple(map, prefix + "ProgramId", this.ProgramId);
        this.setParamArraySimple(map, prefix + "ProgramIdList.", this.ProgramIdList);

    }
}

