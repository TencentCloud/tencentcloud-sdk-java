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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteVpcFwGroupRequest extends AbstractModel{

    /**
    * 防火墙(组)Id
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * 是否删除整个防火墙(组)
0：不删除防火墙(组)，只删除单独实例
1：删除整个防火墙(组)
    */
    @SerializedName("DeleteFwGroup")
    @Expose
    private Long DeleteFwGroup;

    /**
    * 待删除的防火墙实例数组
    */
    @SerializedName("VpcFwInsList")
    @Expose
    private String [] VpcFwInsList;

    /**
     * Get 防火墙(组)Id 
     * @return FwGroupId 防火墙(组)Id
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set 防火墙(组)Id
     * @param FwGroupId 防火墙(组)Id
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get 是否删除整个防火墙(组)
0：不删除防火墙(组)，只删除单独实例
1：删除整个防火墙(组) 
     * @return DeleteFwGroup 是否删除整个防火墙(组)
0：不删除防火墙(组)，只删除单独实例
1：删除整个防火墙(组)
     */
    public Long getDeleteFwGroup() {
        return this.DeleteFwGroup;
    }

    /**
     * Set 是否删除整个防火墙(组)
0：不删除防火墙(组)，只删除单独实例
1：删除整个防火墙(组)
     * @param DeleteFwGroup 是否删除整个防火墙(组)
0：不删除防火墙(组)，只删除单独实例
1：删除整个防火墙(组)
     */
    public void setDeleteFwGroup(Long DeleteFwGroup) {
        this.DeleteFwGroup = DeleteFwGroup;
    }

    /**
     * Get 待删除的防火墙实例数组 
     * @return VpcFwInsList 待删除的防火墙实例数组
     */
    public String [] getVpcFwInsList() {
        return this.VpcFwInsList;
    }

    /**
     * Set 待删除的防火墙实例数组
     * @param VpcFwInsList 待删除的防火墙实例数组
     */
    public void setVpcFwInsList(String [] VpcFwInsList) {
        this.VpcFwInsList = VpcFwInsList;
    }

    public DeleteVpcFwGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteVpcFwGroupRequest(DeleteVpcFwGroupRequest source) {
        if (source.FwGroupId != null) {
            this.FwGroupId = new String(source.FwGroupId);
        }
        if (source.DeleteFwGroup != null) {
            this.DeleteFwGroup = new Long(source.DeleteFwGroup);
        }
        if (source.VpcFwInsList != null) {
            this.VpcFwInsList = new String[source.VpcFwInsList.length];
            for (int i = 0; i < source.VpcFwInsList.length; i++) {
                this.VpcFwInsList[i] = new String(source.VpcFwInsList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FwGroupId", this.FwGroupId);
        this.setParamSimple(map, prefix + "DeleteFwGroup", this.DeleteFwGroup);
        this.setParamArraySimple(map, prefix + "VpcFwInsList.", this.VpcFwInsList);

    }
}

