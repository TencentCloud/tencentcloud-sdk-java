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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignClientsToSalesRequest extends AbstractModel{

    /**
    * 代客/申请中代客uin列表，最大50条
    */
    @SerializedName("ClientUins")
    @Expose
    private String [] ClientUins;

    /**
    * 业务员uin
    */
    @SerializedName("SalesUin")
    @Expose
    private String SalesUin;

    /**
    * 代客类型:normal-代客 apply-申请中代客
    */
    @SerializedName("AssignClientStatus")
    @Expose
    private String AssignClientStatus;

    /**
    * 操作类型:assign-执行分派 cancel-取消分派
    */
    @SerializedName("AssignActionType")
    @Expose
    private String AssignActionType;

    /**
     * Get 代客/申请中代客uin列表，最大50条 
     * @return ClientUins 代客/申请中代客uin列表，最大50条
     */
    public String [] getClientUins() {
        return this.ClientUins;
    }

    /**
     * Set 代客/申请中代客uin列表，最大50条
     * @param ClientUins 代客/申请中代客uin列表，最大50条
     */
    public void setClientUins(String [] ClientUins) {
        this.ClientUins = ClientUins;
    }

    /**
     * Get 业务员uin 
     * @return SalesUin 业务员uin
     */
    public String getSalesUin() {
        return this.SalesUin;
    }

    /**
     * Set 业务员uin
     * @param SalesUin 业务员uin
     */
    public void setSalesUin(String SalesUin) {
        this.SalesUin = SalesUin;
    }

    /**
     * Get 代客类型:normal-代客 apply-申请中代客 
     * @return AssignClientStatus 代客类型:normal-代客 apply-申请中代客
     */
    public String getAssignClientStatus() {
        return this.AssignClientStatus;
    }

    /**
     * Set 代客类型:normal-代客 apply-申请中代客
     * @param AssignClientStatus 代客类型:normal-代客 apply-申请中代客
     */
    public void setAssignClientStatus(String AssignClientStatus) {
        this.AssignClientStatus = AssignClientStatus;
    }

    /**
     * Get 操作类型:assign-执行分派 cancel-取消分派 
     * @return AssignActionType 操作类型:assign-执行分派 cancel-取消分派
     */
    public String getAssignActionType() {
        return this.AssignActionType;
    }

    /**
     * Set 操作类型:assign-执行分派 cancel-取消分派
     * @param AssignActionType 操作类型:assign-执行分派 cancel-取消分派
     */
    public void setAssignActionType(String AssignActionType) {
        this.AssignActionType = AssignActionType;
    }

    public AssignClientsToSalesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignClientsToSalesRequest(AssignClientsToSalesRequest source) {
        if (source.ClientUins != null) {
            this.ClientUins = new String[source.ClientUins.length];
            for (int i = 0; i < source.ClientUins.length; i++) {
                this.ClientUins[i] = new String(source.ClientUins[i]);
            }
        }
        if (source.SalesUin != null) {
            this.SalesUin = new String(source.SalesUin);
        }
        if (source.AssignClientStatus != null) {
            this.AssignClientStatus = new String(source.AssignClientStatus);
        }
        if (source.AssignActionType != null) {
            this.AssignActionType = new String(source.AssignActionType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ClientUins.", this.ClientUins);
        this.setParamSimple(map, prefix + "SalesUin", this.SalesUin);
        this.setParamSimple(map, prefix + "AssignClientStatus", this.AssignClientStatus);
        this.setParamSimple(map, prefix + "AssignActionType", this.AssignActionType);

    }
}

