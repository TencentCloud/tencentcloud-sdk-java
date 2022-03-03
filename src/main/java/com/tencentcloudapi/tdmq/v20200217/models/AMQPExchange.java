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

public class AMQPExchange extends AbstractModel{

    /**
    * Exchange名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Exchange的类别，为枚举类型:Direct, Fanout, Topic
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 主绑定数
    */
    @SerializedName("SourceBindedNum")
    @Expose
    private Long SourceBindedNum;

    /**
    * 说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 被绑定数
    */
    @SerializedName("DestBindedNum")
    @Expose
    private Long DestBindedNum;

    /**
    * 创建时间，以毫秒为单位
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 创建时间，以毫秒为单位
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 是否为内部Exchange(以amq.前缀开头的)
    */
    @SerializedName("Internal")
    @Expose
    private Boolean Internal;

    /**
    * 备用Exchange名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlternateExchange")
    @Expose
    private String AlternateExchange;

    /**
    * 备用Exchange是否删除标识: true(已删除)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlternateExchangeDeleteMark")
    @Expose
    private Boolean AlternateExchangeDeleteMark;

    /**
    * 延迟Exchange的类别，为枚举类型:Direct, Fanout, Topic
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayType")
    @Expose
    private String DelayType;

    /**
     * Get Exchange名称 
     * @return Name Exchange名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Exchange名称
     * @param Name Exchange名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Exchange的类别，为枚举类型:Direct, Fanout, Topic 
     * @return Type Exchange的类别，为枚举类型:Direct, Fanout, Topic
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Exchange的类别，为枚举类型:Direct, Fanout, Topic
     * @param Type Exchange的类别，为枚举类型:Direct, Fanout, Topic
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 主绑定数 
     * @return SourceBindedNum 主绑定数
     */
    public Long getSourceBindedNum() {
        return this.SourceBindedNum;
    }

    /**
     * Set 主绑定数
     * @param SourceBindedNum 主绑定数
     */
    public void setSourceBindedNum(Long SourceBindedNum) {
        this.SourceBindedNum = SourceBindedNum;
    }

    /**
     * Get 说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 被绑定数 
     * @return DestBindedNum 被绑定数
     */
    public Long getDestBindedNum() {
        return this.DestBindedNum;
    }

    /**
     * Set 被绑定数
     * @param DestBindedNum 被绑定数
     */
    public void setDestBindedNum(Long DestBindedNum) {
        this.DestBindedNum = DestBindedNum;
    }

    /**
     * Get 创建时间，以毫秒为单位 
     * @return CreateTime 创建时间，以毫秒为单位
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，以毫秒为单位
     * @param CreateTime 创建时间，以毫秒为单位
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 创建时间，以毫秒为单位 
     * @return UpdateTime 创建时间，以毫秒为单位
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 创建时间，以毫秒为单位
     * @param UpdateTime 创建时间，以毫秒为单位
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 是否为内部Exchange(以amq.前缀开头的) 
     * @return Internal 是否为内部Exchange(以amq.前缀开头的)
     */
    public Boolean getInternal() {
        return this.Internal;
    }

    /**
     * Set 是否为内部Exchange(以amq.前缀开头的)
     * @param Internal 是否为内部Exchange(以amq.前缀开头的)
     */
    public void setInternal(Boolean Internal) {
        this.Internal = Internal;
    }

    /**
     * Get 备用Exchange名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlternateExchange 备用Exchange名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlternateExchange() {
        return this.AlternateExchange;
    }

    /**
     * Set 备用Exchange名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlternateExchange 备用Exchange名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlternateExchange(String AlternateExchange) {
        this.AlternateExchange = AlternateExchange;
    }

    /**
     * Get 备用Exchange是否删除标识: true(已删除)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlternateExchangeDeleteMark 备用Exchange是否删除标识: true(已删除)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAlternateExchangeDeleteMark() {
        return this.AlternateExchangeDeleteMark;
    }

    /**
     * Set 备用Exchange是否删除标识: true(已删除)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlternateExchangeDeleteMark 备用Exchange是否删除标识: true(已删除)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlternateExchangeDeleteMark(Boolean AlternateExchangeDeleteMark) {
        this.AlternateExchangeDeleteMark = AlternateExchangeDeleteMark;
    }

    /**
     * Get 延迟Exchange的类别，为枚举类型:Direct, Fanout, Topic
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayType 延迟Exchange的类别，为枚举类型:Direct, Fanout, Topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDelayType() {
        return this.DelayType;
    }

    /**
     * Set 延迟Exchange的类别，为枚举类型:Direct, Fanout, Topic
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayType 延迟Exchange的类别，为枚举类型:Direct, Fanout, Topic
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayType(String DelayType) {
        this.DelayType = DelayType;
    }

    public AMQPExchange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AMQPExchange(AMQPExchange source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SourceBindedNum != null) {
            this.SourceBindedNum = new Long(source.SourceBindedNum);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DestBindedNum != null) {
            this.DestBindedNum = new Long(source.DestBindedNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Internal != null) {
            this.Internal = new Boolean(source.Internal);
        }
        if (source.AlternateExchange != null) {
            this.AlternateExchange = new String(source.AlternateExchange);
        }
        if (source.AlternateExchangeDeleteMark != null) {
            this.AlternateExchangeDeleteMark = new Boolean(source.AlternateExchangeDeleteMark);
        }
        if (source.DelayType != null) {
            this.DelayType = new String(source.DelayType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SourceBindedNum", this.SourceBindedNum);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DestBindedNum", this.DestBindedNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Internal", this.Internal);
        this.setParamSimple(map, prefix + "AlternateExchange", this.AlternateExchange);
        this.setParamSimple(map, prefix + "AlternateExchangeDeleteMark", this.AlternateExchangeDeleteMark);
        this.setParamSimple(map, prefix + "DelayType", this.DelayType);

    }
}

