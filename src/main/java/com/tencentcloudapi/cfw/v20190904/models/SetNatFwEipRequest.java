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

public class SetNatFwEipRequest extends AbstractModel {

    /**
    * <p>bind：绑定eip；unbind：解绑eip；newAdd：新增防火墙弹性公网ip</p>
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * <p>防火墙实例id</p>
    */
    @SerializedName("CfwInstance")
    @Expose
    private String CfwInstance;

    /**
    * <p>当OperationType 为bind或unbind操作时，使用该字段。</p>
    */
    @SerializedName("EipList")
    @Expose
    private String [] EipList;

    /**
     * Get <p>bind：绑定eip；unbind：解绑eip；newAdd：新增防火墙弹性公网ip</p> 
     * @return OperationType <p>bind：绑定eip；unbind：解绑eip；newAdd：新增防火墙弹性公网ip</p>
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set <p>bind：绑定eip；unbind：解绑eip；newAdd：新增防火墙弹性公网ip</p>
     * @param OperationType <p>bind：绑定eip；unbind：解绑eip；newAdd：新增防火墙弹性公网ip</p>
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get <p>防火墙实例id</p> 
     * @return CfwInstance <p>防火墙实例id</p>
     */
    public String getCfwInstance() {
        return this.CfwInstance;
    }

    /**
     * Set <p>防火墙实例id</p>
     * @param CfwInstance <p>防火墙实例id</p>
     */
    public void setCfwInstance(String CfwInstance) {
        this.CfwInstance = CfwInstance;
    }

    /**
     * Get <p>当OperationType 为bind或unbind操作时，使用该字段。</p> 
     * @return EipList <p>当OperationType 为bind或unbind操作时，使用该字段。</p>
     */
    public String [] getEipList() {
        return this.EipList;
    }

    /**
     * Set <p>当OperationType 为bind或unbind操作时，使用该字段。</p>
     * @param EipList <p>当OperationType 为bind或unbind操作时，使用该字段。</p>
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

