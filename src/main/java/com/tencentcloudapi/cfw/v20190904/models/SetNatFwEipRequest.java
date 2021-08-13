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

public class SetNatFwEipRequest extends AbstractModel{

    /**
    * bind：绑定eip；unbind：解绑eip；newAdd：新增防火墙弹性公网ip
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 防火墙实例id
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
    * 当OperationType 为bind或unbind操作时，使用该字段。
    */
    @SerializedName("EipList")
    @Expose
    private String [] EipList;

    /**
     * Get bind：绑定eip；unbind：解绑eip；newAdd：新增防火墙弹性公网ip 
     * @return OperationType bind：绑定eip；unbind：解绑eip；newAdd：新增防火墙弹性公网ip
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set bind：绑定eip；unbind：解绑eip；newAdd：新增防火墙弹性公网ip
     * @param OperationType bind：绑定eip；unbind：解绑eip；newAdd：新增防火墙弹性公网ip
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 防火墙实例id 
     * @return CfwInstance 防火墙实例id
     */
    public String getCfwInstance() {
        return this.CfwInstance;
    }

    /**
     * Set 防火墙实例id
     * @param CfwInstance 防火墙实例id
     */
    public void setCfwInstance(String CfwInstance) {
        this.CfwInstance = CfwInstance;
    }

    /**
     * Get 当OperationType 为bind或unbind操作时，使用该字段。 
     * @return EipList 当OperationType 为bind或unbind操作时，使用该字段。
     */
    public String [] getEipList() {
        return this.EipList;
    }

    /**
     * Set 当OperationType 为bind或unbind操作时，使用该字段。
     * @param EipList 当OperationType 为bind或unbind操作时，使用该字段。
     */
    public void setEipList(String [] EipList) {
        this.EipList = EipList;
    }

    public SetNatFwEipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetNatFwEipRequest(SetNatFwEipRequest source) {
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.CfwInstance != null) {
            this.CfwInstance = new String(source.CfwInstance);
        }
        if (source.EipList != null) {
            this.EipList = new String[source.EipList.length];
            for (int i = 0; i < source.EipList.length; i++) {
                this.EipList[i] = new String(source.EipList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "CfwInstance", this.CfwInstance);
        this.setParamArraySimple(map, prefix + "EipList.", this.EipList);

    }
}

