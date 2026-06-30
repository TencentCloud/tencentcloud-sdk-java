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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeContentTmpl extends AbstractModel {

    /**
    * <p>自定义通知内容模板id，唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmplID")
    @Expose
    private String TmplID;

    /**
    * <p>自定义通知内容模板名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmplName")
    @Expose
    private String TmplName;

    /**
    * <p>通知内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TmplContents")
    @Expose
    private NoticeContentTmplItem TmplContents;

    /**
    * <p>Unix时间戳，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>Unix时间戳，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>最后修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifier")
    @Expose
    private String LastModifier;

    /**
    * <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>监控类型</p>
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * <p>模板语言 en/zh</p>
    */
    @SerializedName("TmplLanguage")
    @Expose
    private String TmplLanguage;

    /**
     * Get <p>自定义通知内容模板id，唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmplID <p>自定义通知内容模板id，唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTmplID() {
        return this.TmplID;
    }

    /**
     * Set <p>自定义通知内容模板id，唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmplID <p>自定义通知内容模板id，唯一id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmplID(String TmplID) {
        this.TmplID = TmplID;
    }

    /**
     * Get <p>自定义通知内容模板名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmplName <p>自定义通知内容模板名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTmplName() {
        return this.TmplName;
    }

    /**
     * Set <p>自定义通知内容模板名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmplName <p>自定义通知内容模板名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmplName(String TmplName) {
        this.TmplName = TmplName;
    }

    /**
     * Get <p>通知内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TmplContents <p>通知内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NoticeContentTmplItem getTmplContents() {
        return this.TmplContents;
    }

    /**
     * Set <p>通知内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TmplContents <p>通知内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmplContents(NoticeContentTmplItem TmplContents) {
        this.TmplContents = TmplContents;
    }

    /**
     * Get <p>Unix时间戳，秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>Unix时间戳，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Unix时间戳，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>Unix时间戳，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Unix时间戳，秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>Unix时间戳，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Unix时间戳，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>Unix时间戳，秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>最后修改人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifier <p>最后修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifier() {
        return this.LastModifier;
    }

    /**
     * Set <p>最后修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifier <p>最后修改人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifier(String LastModifier) {
        this.LastModifier = LastModifier;
    }

    /**
     * Get <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>监控类型</p> 
     * @return MonitorType <p>监控类型</p>
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set <p>监控类型</p>
     * @param MonitorType <p>监控类型</p>
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get <p>模板语言 en/zh</p> 
     * @return TmplLanguage <p>模板语言 en/zh</p>
     */
    public String getTmplLanguage() {
        return this.TmplLanguage;
    }

    /**
     * Set <p>模板语言 en/zh</p>
     * @param TmplLanguage <p>模板语言 en/zh</p>
     */
    public void setTmplLanguage(String TmplLanguage) {
        this.TmplLanguage = TmplLanguage;
    }

    public NoticeContentTmpl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeContentTmpl(NoticeContentTmpl source) {
        if (source.TmplID != null) {
            this.TmplID = new String(source.TmplID);
        }
        if (source.TmplName != null) {
            this.TmplName = new String(source.TmplName);
        }
        if (source.TmplContents != null) {
            this.TmplContents = new NoticeContentTmplItem(source.TmplContents);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.LastModifier != null) {
            this.LastModifier = new String(source.LastModifier);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.TmplLanguage != null) {
            this.TmplLanguage = new String(source.TmplLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TmplID", this.TmplID);
        this.setParamSimple(map, prefix + "TmplName", this.TmplName);
        this.setParamObj(map, prefix + "TmplContents.", this.TmplContents);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LastModifier", this.LastModifier);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "TmplLanguage", this.TmplLanguage);

    }
}

