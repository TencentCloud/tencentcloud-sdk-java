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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancePreResp extends AbstractModel{

    /**
    * 返回的code，0为正常，非0为错误
    */
    @SerializedName("ReturnCode")
    @Expose
    private String ReturnCode;

    /**
    * 成功消息
    */
    @SerializedName("ReturnMessage")
    @Expose
    private String ReturnMessage;

    /**
    * 操作型返回的Data数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private CreateInstancePreData Data;

    /**
    * 删除是时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteRouteTimestamp")
    @Expose
    private String DeleteRouteTimestamp;

    /**
     * Get 返回的code，0为正常，非0为错误 
     * @return ReturnCode 返回的code，0为正常，非0为错误
     */
    public String getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 返回的code，0为正常，非0为错误
     * @param ReturnCode 返回的code，0为正常，非0为错误
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 成功消息 
     * @return ReturnMessage 成功消息
     */
    public String getReturnMessage() {
        return this.ReturnMessage;
    }

    /**
     * Set 成功消息
     * @param ReturnMessage 成功消息
     */
    public void setReturnMessage(String ReturnMessage) {
        this.ReturnMessage = ReturnMessage;
    }

    /**
     * Get 操作型返回的Data数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 操作型返回的Data数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateInstancePreData getData() {
        return this.Data;
    }

    /**
     * Set 操作型返回的Data数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 操作型返回的Data数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(CreateInstancePreData Data) {
        this.Data = Data;
    }

    /**
     * Get 删除是时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteRouteTimestamp 删除是时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeleteRouteTimestamp() {
        return this.DeleteRouteTimestamp;
    }

    /**
     * Set 删除是时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteRouteTimestamp 删除是时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteRouteTimestamp(String DeleteRouteTimestamp) {
        this.DeleteRouteTimestamp = DeleteRouteTimestamp;
    }

    public CreateInstancePreResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePreResp(CreateInstancePreResp source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new String(source.ReturnCode);
        }
        if (source.ReturnMessage != null) {
            this.ReturnMessage = new String(source.ReturnMessage);
        }
        if (source.Data != null) {
            this.Data = new CreateInstancePreData(source.Data);
        }
        if (source.DeleteRouteTimestamp != null) {
            this.DeleteRouteTimestamp = new String(source.DeleteRouteTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMessage", this.ReturnMessage);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "DeleteRouteTimestamp", this.DeleteRouteTimestamp);

    }
}

