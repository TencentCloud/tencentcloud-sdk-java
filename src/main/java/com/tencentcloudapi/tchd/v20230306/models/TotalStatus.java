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
package com.tencentcloudapi.tchd.v20230306.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TotalStatus extends AbstractModel {

    /**
    * 正常状态的数目
    */
    @SerializedName("NormalCount")
    @Expose
    private Long NormalCount;

    /**
    * 通知状态的数目
    */
    @SerializedName("NotifyCount")
    @Expose
    private Long NotifyCount;

    /**
    * 异常状态的数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AbnormalCount")
    @Expose
    private Long AbnormalCount;

    /**
     * Get 正常状态的数目 
     * @return NormalCount 正常状态的数目
     */
    public Long getNormalCount() {
        return this.NormalCount;
    }

    /**
     * Set 正常状态的数目
     * @param NormalCount 正常状态的数目
     */
    public void setNormalCount(Long NormalCount) {
        this.NormalCount = NormalCount;
    }

    /**
     * Get 通知状态的数目 
     * @return NotifyCount 通知状态的数目
     */
    public Long getNotifyCount() {
        return this.NotifyCount;
    }

    /**
     * Set 通知状态的数目
     * @param NotifyCount 通知状态的数目
     */
    public void setNotifyCount(Long NotifyCount) {
        this.NotifyCount = NotifyCount;
    }

    /**
     * Get 异常状态的数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AbnormalCount 异常状态的数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAbnormalCount() {
        return this.AbnormalCount;
    }

    /**
     * Set 异常状态的数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param AbnormalCount 异常状态的数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbnormalCount(Long AbnormalCount) {
        this.AbnormalCount = AbnormalCount;
    }

    public TotalStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TotalStatus(TotalStatus source) {
        if (source.NormalCount != null) {
            this.NormalCount = new Long(source.NormalCount);
        }
        if (source.NotifyCount != null) {
            this.NotifyCount = new Long(source.NotifyCount);
        }
        if (source.AbnormalCount != null) {
            this.AbnormalCount = new Long(source.AbnormalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NormalCount", this.NormalCount);
        this.setParamSimple(map, prefix + "NotifyCount", this.NotifyCount);
        this.setParamSimple(map, prefix + "AbnormalCount", this.AbnormalCount);

    }
}

