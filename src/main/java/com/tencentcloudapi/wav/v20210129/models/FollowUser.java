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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FollowUser extends AbstractModel{

    /**
    * 添加了此外部联系人的企业成员userid
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 该成员对此外部联系人的备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 该成员对此外部联系人的描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 该成员添加此外部联系人的时间戳，单位为秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 该成员添加此客户的来源，具体含义详见<a href="https://work.weixin.qq.com/api/doc/90000/90135/92114#%E6%9D%A5%E6%BA%90%E5%AE%9A%E4%B9%89">来源定义</a>
    */
    @SerializedName("AddWay")
    @Expose
    private Long AddWay;

    /**
    * 发起添加的userid，如果成员主动添加，为成员的userid；如果是客户主动添加，则为客户的外部联系人userid；如果是内部成员共享/管理员分配，则为对应的成员/管理员userid
    */
    @SerializedName("OperUserId")
    @Expose
    private String OperUserId;

    /**
    * 该成员添加此外部联系人所打标签信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private ExternalContactTag [] Tags;

    /**
     * Get 添加了此外部联系人的企业成员userid 
     * @return UserId 添加了此外部联系人的企业成员userid
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 添加了此外部联系人的企业成员userid
     * @param UserId 添加了此外部联系人的企业成员userid
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 该成员对此外部联系人的备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 该成员对此外部联系人的备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 该成员对此外部联系人的备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 该成员对此外部联系人的备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 该成员对此外部联系人的描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 该成员对此外部联系人的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 该成员对此外部联系人的描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 该成员对此外部联系人的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 该成员添加此外部联系人的时间戳，单位为秒 
     * @return CreateTime 该成员添加此外部联系人的时间戳，单位为秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 该成员添加此外部联系人的时间戳，单位为秒
     * @param CreateTime 该成员添加此外部联系人的时间戳，单位为秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 该成员添加此客户的来源，具体含义详见<a href="https://work.weixin.qq.com/api/doc/90000/90135/92114#%E6%9D%A5%E6%BA%90%E5%AE%9A%E4%B9%89">来源定义</a> 
     * @return AddWay 该成员添加此客户的来源，具体含义详见<a href="https://work.weixin.qq.com/api/doc/90000/90135/92114#%E6%9D%A5%E6%BA%90%E5%AE%9A%E4%B9%89">来源定义</a>
     */
    public Long getAddWay() {
        return this.AddWay;
    }

    /**
     * Set 该成员添加此客户的来源，具体含义详见<a href="https://work.weixin.qq.com/api/doc/90000/90135/92114#%E6%9D%A5%E6%BA%90%E5%AE%9A%E4%B9%89">来源定义</a>
     * @param AddWay 该成员添加此客户的来源，具体含义详见<a href="https://work.weixin.qq.com/api/doc/90000/90135/92114#%E6%9D%A5%E6%BA%90%E5%AE%9A%E4%B9%89">来源定义</a>
     */
    public void setAddWay(Long AddWay) {
        this.AddWay = AddWay;
    }

    /**
     * Get 发起添加的userid，如果成员主动添加，为成员的userid；如果是客户主动添加，则为客户的外部联系人userid；如果是内部成员共享/管理员分配，则为对应的成员/管理员userid 
     * @return OperUserId 发起添加的userid，如果成员主动添加，为成员的userid；如果是客户主动添加，则为客户的外部联系人userid；如果是内部成员共享/管理员分配，则为对应的成员/管理员userid
     */
    public String getOperUserId() {
        return this.OperUserId;
    }

    /**
     * Set 发起添加的userid，如果成员主动添加，为成员的userid；如果是客户主动添加，则为客户的外部联系人userid；如果是内部成员共享/管理员分配，则为对应的成员/管理员userid
     * @param OperUserId 发起添加的userid，如果成员主动添加，为成员的userid；如果是客户主动添加，则为客户的外部联系人userid；如果是内部成员共享/管理员分配，则为对应的成员/管理员userid
     */
    public void setOperUserId(String OperUserId) {
        this.OperUserId = OperUserId;
    }

    /**
     * Get 该成员添加此外部联系人所打标签信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 该成员添加此外部联系人所打标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExternalContactTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 该成员添加此外部联系人所打标签信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 该成员添加此外部联系人所打标签信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(ExternalContactTag [] Tags) {
        this.Tags = Tags;
    }

    public FollowUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FollowUser(FollowUser source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.AddWay != null) {
            this.AddWay = new Long(source.AddWay);
        }
        if (source.OperUserId != null) {
            this.OperUserId = new String(source.OperUserId);
        }
        if (source.Tags != null) {
            this.Tags = new ExternalContactTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ExternalContactTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AddWay", this.AddWay);
        this.setParamSimple(map, prefix + "OperUserId", this.OperUserId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

