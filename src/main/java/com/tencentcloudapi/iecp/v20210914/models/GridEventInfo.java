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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GridEventInfo extends AbstractModel{

    /**
    * 首次出现时间
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 最后出现时间
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 对象类型
    */
    @SerializedName("InvolvedObjectKind")
    @Expose
    private String InvolvedObjectKind;

    /**
    * 对象名称
    */
    @SerializedName("InvolvedObjectName")
    @Expose
    private String InvolvedObjectName;

    /**
    * 事件类型(Normal,Warning)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 事件内容
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 节点名（Pod事件类型时有值）
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点内部IP（Pod事件类型时有值）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
     * Get 首次出现时间 
     * @return FirstTime 首次出现时间
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 首次出现时间
     * @param FirstTime 首次出现时间
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 最后出现时间 
     * @return LastTime 最后出现时间
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最后出现时间
     * @param LastTime 最后出现时间
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 对象类型 
     * @return InvolvedObjectKind 对象类型
     */
    public String getInvolvedObjectKind() {
        return this.InvolvedObjectKind;
    }

    /**
     * Set 对象类型
     * @param InvolvedObjectKind 对象类型
     */
    public void setInvolvedObjectKind(String InvolvedObjectKind) {
        this.InvolvedObjectKind = InvolvedObjectKind;
    }

    /**
     * Get 对象名称 
     * @return InvolvedObjectName 对象名称
     */
    public String getInvolvedObjectName() {
        return this.InvolvedObjectName;
    }

    /**
     * Set 对象名称
     * @param InvolvedObjectName 对象名称
     */
    public void setInvolvedObjectName(String InvolvedObjectName) {
        this.InvolvedObjectName = InvolvedObjectName;
    }

    /**
     * Get 事件类型(Normal,Warning) 
     * @return Type 事件类型(Normal,Warning)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件类型(Normal,Warning)
     * @param Type 事件类型(Normal,Warning)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件原因 
     * @return Reason 事件原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 事件原因
     * @param Reason 事件原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 事件内容 
     * @return Message 事件内容
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 事件内容
     * @param Message 事件内容
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 次数 
     * @return Count 次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 次数
     * @param Count 次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 节点名（Pod事件类型时有值） 
     * @return NodeName 节点名（Pod事件类型时有值）
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名（Pod事件类型时有值）
     * @param NodeName 节点名（Pod事件类型时有值）
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点内部IP（Pod事件类型时有值）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP 节点内部IP（Pod事件类型时有值）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 节点内部IP（Pod事件类型时有值）
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP 节点内部IP（Pod事件类型时有值）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    public GridEventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GridEventInfo(GridEventInfo source) {
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.InvolvedObjectKind != null) {
            this.InvolvedObjectKind = new String(source.InvolvedObjectKind);
        }
        if (source.InvolvedObjectName != null) {
            this.InvolvedObjectName = new String(source.InvolvedObjectName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "InvolvedObjectKind", this.InvolvedObjectKind);
        this.setParamSimple(map, prefix + "InvolvedObjectName", this.InvolvedObjectName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "IP", this.IP);

    }
}

