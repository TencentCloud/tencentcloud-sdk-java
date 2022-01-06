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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalEvents extends AbstractModel{

    /**
    * 对应查询日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 列表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Info")
    @Expose
    private AbnormalEventsInfo [] Info;

    /**
     * Get 对应查询日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Date 对应查询日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 对应查询日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param Date 对应查询日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 列表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Info 列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AbnormalEventsInfo [] getInfo() {
        return this.Info;
    }

    /**
     * Set 列表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Info 列表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfo(AbnormalEventsInfo [] Info) {
        this.Info = Info;
    }

    public AbnormalEvents() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalEvents(AbnormalEvents source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Info != null) {
            this.Info = new AbnormalEventsInfo[source.Info.length];
            for (int i = 0; i < source.Info.length; i++) {
                this.Info[i] = new AbnormalEventsInfo(source.Info[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamArrayObj(map, prefix + "Info.", this.Info);

    }
}

