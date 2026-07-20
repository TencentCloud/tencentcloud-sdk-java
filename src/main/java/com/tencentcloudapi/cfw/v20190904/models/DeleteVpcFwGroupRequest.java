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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteVpcFwGroupRequest extends AbstractModel {

    /**
    * <p>防火墙(组)Id</p>
    */
    @SerializedName("FwGroupId")
    @Expose
    private String FwGroupId;

    /**
    * <p>是否删除整个防火墙(组)<br>0：不删除防火墙(组)，只删除单独实例<br>1：删除整个防火墙(组)</p>
    */
    @SerializedName("DeleteFwGroup")
    @Expose
    private Long DeleteFwGroup;

    /**
    * <p>待删除的防火墙实例数组</p>
    */
    @SerializedName("VpcFwInsList")
    @Expose
    private String [] VpcFwInsList;

    /**
     * Get <p>防火墙(组)Id</p> 
     * @return FwGroupId <p>防火墙(组)Id</p>
     */
    public String getFwGroupId() {
        return this.FwGroupId;
    }

    /**
     * Set <p>防火墙(组)Id</p>
     * @param FwGroupId <p>防火墙(组)Id</p>
     */
    public void setFwGroupId(String FwGroupId) {
        this.FwGroupId = FwGroupId;
    }

    /**
     * Get <p>是否删除整个防火墙(组)<br>0：不删除防火墙(组)，只删除单独实例<br>1：删除整个防火墙(组)</p> 
     * @return DeleteFwGroup <p>是否删除整个防火墙(组)<br>0：不删除防火墙(组)，只删除单独实例<br>1：删除整个防火墙(组)</p>
     */
    public Long getDeleteFwGroup() {
        return this.DeleteFwGroup;
    }

    /**
     * Set <p>是否删除整个防火墙(组)<br>0：不删除防火墙(组)，只删除单独实例<br>1：删除整个防火墙(组)</p>
     * @param DeleteFwGroup <p>是否删除整个防火墙(组)<br>0：不删除防火墙(组)，只删除单独实例<br>1：删除整个防火墙(组)</p>
     */
    public void setDeleteFwGroup(Long DeleteFwGroup) {
        this.DeleteFwGroup = DeleteFwGroup;
    }

    /**
     * Get <p>待删除的防火墙实例数组</p> 
     * @return VpcFwInsList <p>待删除的防火墙实例数组</p>
     */
    public String [] getVpcFwInsList() {
        return this.VpcFwInsList;
    }

    /**
     * Set <p>待删除的防火墙实例数组</p>
     * @param VpcFwInsList <p>待删除的防火墙实例数组</p>
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

