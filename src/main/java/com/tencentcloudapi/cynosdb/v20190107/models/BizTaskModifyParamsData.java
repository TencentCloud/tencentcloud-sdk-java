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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BizTaskModifyParamsData extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群参数修改数据
    */
    @SerializedName("ClusterParamList")
    @Expose
    private ModifyParamItem [] ClusterParamList;

    /**
    * 实例参数修改数据
    */
    @SerializedName("ModifyInstanceParams")
    @Expose
    private BizTaskModifyInstanceParam [] ModifyInstanceParams;

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
     * Get 集群参数修改数据 
     * @return ClusterParamList 集群参数修改数据
     */
    public ModifyParamItem [] getClusterParamList() {
        return this.ClusterParamList;
    }

    /**
     * Set 集群参数修改数据
     * @param ClusterParamList 集群参数修改数据
     */
    public void setClusterParamList(ModifyParamItem [] ClusterParamList) {
        this.ClusterParamList = ClusterParamList;
    }

    /**
     * Get 实例参数修改数据 
     * @return ModifyInstanceParams 实例参数修改数据
     */
    public BizTaskModifyInstanceParam [] getModifyInstanceParams() {
        return this.ModifyInstanceParams;
    }

    /**
     * Set 实例参数修改数据
     * @param ModifyInstanceParams 实例参数修改数据
     */
    public void setModifyInstanceParams(BizTaskModifyInstanceParam [] ModifyInstanceParams) {
        this.ModifyInstanceParams = ModifyInstanceParams;
    }

    public BizTaskModifyParamsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BizTaskModifyParamsData(BizTaskModifyParamsData source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterParamList != null) {
            this.ClusterParamList = new ModifyParamItem[source.ClusterParamList.length];
            for (int i = 0; i < source.ClusterParamList.length; i++) {
                this.ClusterParamList[i] = new ModifyParamItem(source.ClusterParamList[i]);
            }
        }
        if (source.ModifyInstanceParams != null) {
            this.ModifyInstanceParams = new BizTaskModifyInstanceParam[source.ModifyInstanceParams.length];
            for (int i = 0; i < source.ModifyInstanceParams.length; i++) {
                this.ModifyInstanceParams[i] = new BizTaskModifyInstanceParam(source.ModifyInstanceParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArrayObj(map, prefix + "ClusterParamList.", this.ClusterParamList);
        this.setParamArrayObj(map, prefix + "ModifyInstanceParams.", this.ModifyInstanceParams);

    }
}

