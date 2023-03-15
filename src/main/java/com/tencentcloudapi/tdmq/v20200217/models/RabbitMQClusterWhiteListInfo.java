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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQClusterWhiteListInfo extends AbstractModel{

    /**
    * 废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WhiteList")
    @Expose
    private String WhiteList;

    /**
    * 公网管控台白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicControlConsoleWhiteList")
    @Expose
    private String PublicControlConsoleWhiteList;

    /**
    * 公网数据流白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicDataStreamWhiteList")
    @Expose
    private String PublicDataStreamWhiteList;

    /**
    * 公网管控台白名单状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicControlConsoleWhiteListStatus")
    @Expose
    private String PublicControlConsoleWhiteListStatus;

    /**
    * 公网数据流白名单状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicDataStreamWhiteListStatus")
    @Expose
    private String PublicDataStreamWhiteListStatus;

    /**
     * Get 废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WhiteList 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWhiteList() {
        return this.WhiteList;
    }

    /**
     * Set 废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param WhiteList 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWhiteList(String WhiteList) {
        this.WhiteList = WhiteList;
    }

    /**
     * Get 公网管控台白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicControlConsoleWhiteList 公网管控台白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicControlConsoleWhiteList() {
        return this.PublicControlConsoleWhiteList;
    }

    /**
     * Set 公网管控台白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicControlConsoleWhiteList 公网管控台白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicControlConsoleWhiteList(String PublicControlConsoleWhiteList) {
        this.PublicControlConsoleWhiteList = PublicControlConsoleWhiteList;
    }

    /**
     * Get 公网数据流白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicDataStreamWhiteList 公网数据流白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicDataStreamWhiteList() {
        return this.PublicDataStreamWhiteList;
    }

    /**
     * Set 公网数据流白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicDataStreamWhiteList 公网数据流白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicDataStreamWhiteList(String PublicDataStreamWhiteList) {
        this.PublicDataStreamWhiteList = PublicDataStreamWhiteList;
    }

    /**
     * Get 公网管控台白名单状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicControlConsoleWhiteListStatus 公网管控台白名单状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicControlConsoleWhiteListStatus() {
        return this.PublicControlConsoleWhiteListStatus;
    }

    /**
     * Set 公网管控台白名单状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicControlConsoleWhiteListStatus 公网管控台白名单状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicControlConsoleWhiteListStatus(String PublicControlConsoleWhiteListStatus) {
        this.PublicControlConsoleWhiteListStatus = PublicControlConsoleWhiteListStatus;
    }

    /**
     * Get 公网数据流白名单状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicDataStreamWhiteListStatus 公网数据流白名单状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicDataStreamWhiteListStatus() {
        return this.PublicDataStreamWhiteListStatus;
    }

    /**
     * Set 公网数据流白名单状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicDataStreamWhiteListStatus 公网数据流白名单状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicDataStreamWhiteListStatus(String PublicDataStreamWhiteListStatus) {
        this.PublicDataStreamWhiteListStatus = PublicDataStreamWhiteListStatus;
    }

    public RabbitMQClusterWhiteListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQClusterWhiteListInfo(RabbitMQClusterWhiteListInfo source) {
        if (source.WhiteList != null) {
            this.WhiteList = new String(source.WhiteList);
        }
        if (source.PublicControlConsoleWhiteList != null) {
            this.PublicControlConsoleWhiteList = new String(source.PublicControlConsoleWhiteList);
        }
        if (source.PublicDataStreamWhiteList != null) {
            this.PublicDataStreamWhiteList = new String(source.PublicDataStreamWhiteList);
        }
        if (source.PublicControlConsoleWhiteListStatus != null) {
            this.PublicControlConsoleWhiteListStatus = new String(source.PublicControlConsoleWhiteListStatus);
        }
        if (source.PublicDataStreamWhiteListStatus != null) {
            this.PublicDataStreamWhiteListStatus = new String(source.PublicDataStreamWhiteListStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WhiteList", this.WhiteList);
        this.setParamSimple(map, prefix + "PublicControlConsoleWhiteList", this.PublicControlConsoleWhiteList);
        this.setParamSimple(map, prefix + "PublicDataStreamWhiteList", this.PublicDataStreamWhiteList);
        this.setParamSimple(map, prefix + "PublicControlConsoleWhiteListStatus", this.PublicControlConsoleWhiteListStatus);
        this.setParamSimple(map, prefix + "PublicDataStreamWhiteListStatus", this.PublicDataStreamWhiteListStatus);

    }
}

