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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocLifecycle extends AbstractModel {

    /**
    * <p>创建时间（Unix 秒）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpirationPolicy")
    @Expose
    private ExpirationPolicy ExpirationPolicy;

    /**
    * <p>文档状态：1=解析中，2=解析失败，3=导入失败，4=审核中，5=审核失败，6=学习中，7=学习失败，8=导入完成，9=已过期，10=超量失效，11=超量失效恢复中，12=重命名审核失败，13=重命名申诉失败，14=人工申诉中，15=人工申诉失败<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_STATUS_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_STATUS_PARSING</td><td>1</td><td>解析中</td></tr><tr><td>DOC_STATUS_PARSE_FAIL</td><td>2</td><td>解析失败</td></tr><tr><td>DOC_STATUS_IMPORT_FAIL</td><td>3</td><td>导入失败</td></tr><tr><td>DOC_STATUS_AUDITING</td><td>4</td><td>审核中</td></tr><tr><td>DOC_STATUS_AUDIT_FAIL</td><td>5</td><td>审核失败</td></tr><tr><td>DOC_STATUS_LEARNING</td><td>6</td><td>学习中</td></tr><tr><td>DOC_STATUS_LEARN_FAIL</td><td>7</td><td>学习失败</td></tr><tr><td>DOC_STATUS_IMPORTED</td><td>8</td><td>导入完成</td></tr><tr><td>DOC_STATUS_EXPIRED</td><td>9</td><td>已过期</td></tr><tr><td>DOC_STATUS_QUOTA_INVALID</td><td>10</td><td>超量失效</td></tr><tr><td>DOC_STATUS_QUOTA_RECOVERING</td><td>11</td><td>超量失效恢复中</td></tr><tr><td>DOC_STATUS_RENAME_AUDIT_FAIL</td><td>12</td><td>重命名审核失败</td></tr><tr><td>DOC_STATUS_RENAME_APPEAL_FAIL</td><td>13</td><td>重命名申诉失败</td></tr><tr><td>DOC_STATUS_MANUAL_APPEALING</td><td>14</td><td>人工申诉中</td></tr><tr><td>DOC_STATUS_MANUAL_APPEAL_FAIL</td><td>15</td><td>人工申诉失败</td></tr></tbody></table></p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>状态描述</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>状态附加信息</p>
    */
    @SerializedName("StatusMessage")
    @Expose
    private String StatusMessage;

    /**
    * <p>更新时间（Unix 秒）</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get <p>创建时间（Unix 秒）</p> 
     * @return CreateTime <p>创建时间（Unix 秒）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（Unix 秒）</p>
     * @param CreateTime <p>创建时间（Unix 秒）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpirationPolicy <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExpirationPolicy getExpirationPolicy() {
        return this.ExpirationPolicy;
    }

    /**
     * Set <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpirationPolicy <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpirationPolicy(ExpirationPolicy ExpirationPolicy) {
        this.ExpirationPolicy = ExpirationPolicy;
    }

    /**
     * Get <p>文档状态：1=解析中，2=解析失败，3=导入失败，4=审核中，5=审核失败，6=学习中，7=学习失败，8=导入完成，9=已过期，10=超量失效，11=超量失效恢复中，12=重命名审核失败，13=重命名申诉失败，14=人工申诉中，15=人工申诉失败<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_STATUS_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_STATUS_PARSING</td><td>1</td><td>解析中</td></tr><tr><td>DOC_STATUS_PARSE_FAIL</td><td>2</td><td>解析失败</td></tr><tr><td>DOC_STATUS_IMPORT_FAIL</td><td>3</td><td>导入失败</td></tr><tr><td>DOC_STATUS_AUDITING</td><td>4</td><td>审核中</td></tr><tr><td>DOC_STATUS_AUDIT_FAIL</td><td>5</td><td>审核失败</td></tr><tr><td>DOC_STATUS_LEARNING</td><td>6</td><td>学习中</td></tr><tr><td>DOC_STATUS_LEARN_FAIL</td><td>7</td><td>学习失败</td></tr><tr><td>DOC_STATUS_IMPORTED</td><td>8</td><td>导入完成</td></tr><tr><td>DOC_STATUS_EXPIRED</td><td>9</td><td>已过期</td></tr><tr><td>DOC_STATUS_QUOTA_INVALID</td><td>10</td><td>超量失效</td></tr><tr><td>DOC_STATUS_QUOTA_RECOVERING</td><td>11</td><td>超量失效恢复中</td></tr><tr><td>DOC_STATUS_RENAME_AUDIT_FAIL</td><td>12</td><td>重命名审核失败</td></tr><tr><td>DOC_STATUS_RENAME_APPEAL_FAIL</td><td>13</td><td>重命名申诉失败</td></tr><tr><td>DOC_STATUS_MANUAL_APPEALING</td><td>14</td><td>人工申诉中</td></tr><tr><td>DOC_STATUS_MANUAL_APPEAL_FAIL</td><td>15</td><td>人工申诉失败</td></tr></tbody></table></p> 
     * @return Status <p>文档状态：1=解析中，2=解析失败，3=导入失败，4=审核中，5=审核失败，6=学习中，7=学习失败，8=导入完成，9=已过期，10=超量失效，11=超量失效恢复中，12=重命名审核失败，13=重命名申诉失败，14=人工申诉中，15=人工申诉失败<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_STATUS_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_STATUS_PARSING</td><td>1</td><td>解析中</td></tr><tr><td>DOC_STATUS_PARSE_FAIL</td><td>2</td><td>解析失败</td></tr><tr><td>DOC_STATUS_IMPORT_FAIL</td><td>3</td><td>导入失败</td></tr><tr><td>DOC_STATUS_AUDITING</td><td>4</td><td>审核中</td></tr><tr><td>DOC_STATUS_AUDIT_FAIL</td><td>5</td><td>审核失败</td></tr><tr><td>DOC_STATUS_LEARNING</td><td>6</td><td>学习中</td></tr><tr><td>DOC_STATUS_LEARN_FAIL</td><td>7</td><td>学习失败</td></tr><tr><td>DOC_STATUS_IMPORTED</td><td>8</td><td>导入完成</td></tr><tr><td>DOC_STATUS_EXPIRED</td><td>9</td><td>已过期</td></tr><tr><td>DOC_STATUS_QUOTA_INVALID</td><td>10</td><td>超量失效</td></tr><tr><td>DOC_STATUS_QUOTA_RECOVERING</td><td>11</td><td>超量失效恢复中</td></tr><tr><td>DOC_STATUS_RENAME_AUDIT_FAIL</td><td>12</td><td>重命名审核失败</td></tr><tr><td>DOC_STATUS_RENAME_APPEAL_FAIL</td><td>13</td><td>重命名申诉失败</td></tr><tr><td>DOC_STATUS_MANUAL_APPEALING</td><td>14</td><td>人工申诉中</td></tr><tr><td>DOC_STATUS_MANUAL_APPEAL_FAIL</td><td>15</td><td>人工申诉失败</td></tr></tbody></table></p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>文档状态：1=解析中，2=解析失败，3=导入失败，4=审核中，5=审核失败，6=学习中，7=学习失败，8=导入完成，9=已过期，10=超量失效，11=超量失效恢复中，12=重命名审核失败，13=重命名申诉失败，14=人工申诉中，15=人工申诉失败<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_STATUS_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_STATUS_PARSING</td><td>1</td><td>解析中</td></tr><tr><td>DOC_STATUS_PARSE_FAIL</td><td>2</td><td>解析失败</td></tr><tr><td>DOC_STATUS_IMPORT_FAIL</td><td>3</td><td>导入失败</td></tr><tr><td>DOC_STATUS_AUDITING</td><td>4</td><td>审核中</td></tr><tr><td>DOC_STATUS_AUDIT_FAIL</td><td>5</td><td>审核失败</td></tr><tr><td>DOC_STATUS_LEARNING</td><td>6</td><td>学习中</td></tr><tr><td>DOC_STATUS_LEARN_FAIL</td><td>7</td><td>学习失败</td></tr><tr><td>DOC_STATUS_IMPORTED</td><td>8</td><td>导入完成</td></tr><tr><td>DOC_STATUS_EXPIRED</td><td>9</td><td>已过期</td></tr><tr><td>DOC_STATUS_QUOTA_INVALID</td><td>10</td><td>超量失效</td></tr><tr><td>DOC_STATUS_QUOTA_RECOVERING</td><td>11</td><td>超量失效恢复中</td></tr><tr><td>DOC_STATUS_RENAME_AUDIT_FAIL</td><td>12</td><td>重命名审核失败</td></tr><tr><td>DOC_STATUS_RENAME_APPEAL_FAIL</td><td>13</td><td>重命名申诉失败</td></tr><tr><td>DOC_STATUS_MANUAL_APPEALING</td><td>14</td><td>人工申诉中</td></tr><tr><td>DOC_STATUS_MANUAL_APPEAL_FAIL</td><td>15</td><td>人工申诉失败</td></tr></tbody></table></p>
     * @param Status <p>文档状态：1=解析中，2=解析失败，3=导入失败，4=审核中，5=审核失败，6=学习中，7=学习失败，8=导入完成，9=已过期，10=超量失效，11=超量失效恢复中，12=重命名审核失败，13=重命名申诉失败，14=人工申诉中，15=人工申诉失败<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>DOC_STATUS_UNKNOWN</td><td>0</td><td></td></tr><tr><td>DOC_STATUS_PARSING</td><td>1</td><td>解析中</td></tr><tr><td>DOC_STATUS_PARSE_FAIL</td><td>2</td><td>解析失败</td></tr><tr><td>DOC_STATUS_IMPORT_FAIL</td><td>3</td><td>导入失败</td></tr><tr><td>DOC_STATUS_AUDITING</td><td>4</td><td>审核中</td></tr><tr><td>DOC_STATUS_AUDIT_FAIL</td><td>5</td><td>审核失败</td></tr><tr><td>DOC_STATUS_LEARNING</td><td>6</td><td>学习中</td></tr><tr><td>DOC_STATUS_LEARN_FAIL</td><td>7</td><td>学习失败</td></tr><tr><td>DOC_STATUS_IMPORTED</td><td>8</td><td>导入完成</td></tr><tr><td>DOC_STATUS_EXPIRED</td><td>9</td><td>已过期</td></tr><tr><td>DOC_STATUS_QUOTA_INVALID</td><td>10</td><td>超量失效</td></tr><tr><td>DOC_STATUS_QUOTA_RECOVERING</td><td>11</td><td>超量失效恢复中</td></tr><tr><td>DOC_STATUS_RENAME_AUDIT_FAIL</td><td>12</td><td>重命名审核失败</td></tr><tr><td>DOC_STATUS_RENAME_APPEAL_FAIL</td><td>13</td><td>重命名申诉失败</td></tr><tr><td>DOC_STATUS_MANUAL_APPEALING</td><td>14</td><td>人工申诉中</td></tr><tr><td>DOC_STATUS_MANUAL_APPEAL_FAIL</td><td>15</td><td>人工申诉失败</td></tr></tbody></table></p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>状态描述</p> 
     * @return StatusDesc <p>状态描述</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>状态描述</p>
     * @param StatusDesc <p>状态描述</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>状态附加信息</p> 
     * @return StatusMessage <p>状态附加信息</p>
     */
    public String getStatusMessage() {
        return this.StatusMessage;
    }

    /**
     * Set <p>状态附加信息</p>
     * @param StatusMessage <p>状态附加信息</p>
     */
    public void setStatusMessage(String StatusMessage) {
        this.StatusMessage = StatusMessage;
    }

    /**
     * Get <p>更新时间（Unix 秒）</p> 
     * @return UpdateTime <p>更新时间（Unix 秒）</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（Unix 秒）</p>
     * @param UpdateTime <p>更新时间（Unix 秒）</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DocLifecycle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocLifecycle(DocLifecycle source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpirationPolicy != null) {
            this.ExpirationPolicy = new ExpirationPolicy(source.ExpirationPolicy);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.StatusMessage != null) {
            this.StatusMessage = new String(source.StatusMessage);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "ExpirationPolicy.", this.ExpirationPolicy);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "StatusMessage", this.StatusMessage);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

