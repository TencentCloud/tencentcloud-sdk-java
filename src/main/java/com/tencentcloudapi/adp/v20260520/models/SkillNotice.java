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

public class SkillNotice extends AbstractModel {

    /**
    * 通知级别

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 占位 |
| 1 | 成功，字符串面："success" |
| 2 | 警告，字符串面："warning" |
| 3 | 错误，字符串面："error" |
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 文案（i18n 后字符串）
    */
    @SerializedName("NoticeContent")
    @Expose
    private String NoticeContent;

    /**
    * 触发本通知的 Skill 版本ID
    */
    @SerializedName("TriggerVersionId")
    @Expose
    private String TriggerVersionId;

    /**
    * 通知类型 

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 占位 |
| 1 | 发布失败 |
| 2 | 共享审批被拒 |
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 通知级别

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 占位 |
| 1 | 成功，字符串面："success" |
| 2 | 警告，字符串面："warning" |
| 3 | 错误，字符串面："error" | 
     * @return Level 通知级别

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 占位 |
| 1 | 成功，字符串面："success" |
| 2 | 警告，字符串面："warning" |
| 3 | 错误，字符串面："error" |
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 通知级别

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 占位 |
| 1 | 成功，字符串面："success" |
| 2 | 警告，字符串面："warning" |
| 3 | 错误，字符串面："error" |
     * @param Level 通知级别

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 占位 |
| 1 | 成功，字符串面："success" |
| 2 | 警告，字符串面："warning" |
| 3 | 错误，字符串面："error" |
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 文案（i18n 后字符串） 
     * @return NoticeContent 文案（i18n 后字符串）
     */
    public String getNoticeContent() {
        return this.NoticeContent;
    }

    /**
     * Set 文案（i18n 后字符串）
     * @param NoticeContent 文案（i18n 后字符串）
     */
    public void setNoticeContent(String NoticeContent) {
        this.NoticeContent = NoticeContent;
    }

    /**
     * Get 触发本通知的 Skill 版本ID 
     * @return TriggerVersionId 触发本通知的 Skill 版本ID
     */
    public String getTriggerVersionId() {
        return this.TriggerVersionId;
    }

    /**
     * Set 触发本通知的 Skill 版本ID
     * @param TriggerVersionId 触发本通知的 Skill 版本ID
     */
    public void setTriggerVersionId(String TriggerVersionId) {
        this.TriggerVersionId = TriggerVersionId;
    }

    /**
     * Get 通知类型 

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 占位 |
| 1 | 发布失败 |
| 2 | 共享审批被拒 | 
     * @return Type 通知类型 

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 占位 |
| 1 | 发布失败 |
| 2 | 共享审批被拒 |
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 通知类型 

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 占位 |
| 1 | 发布失败 |
| 2 | 共享审批被拒 |
     * @param Type 通知类型 

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 占位 |
| 1 | 发布失败 |
| 2 | 共享审批被拒 |
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public SkillNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillNotice(SkillNotice source) {
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.NoticeContent != null) {
            this.NoticeContent = new String(source.NoticeContent);
        }
        if (source.TriggerVersionId != null) {
            this.TriggerVersionId = new String(source.TriggerVersionId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "NoticeContent", this.NoticeContent);
        this.setParamSimple(map, prefix + "TriggerVersionId", this.TriggerVersionId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

