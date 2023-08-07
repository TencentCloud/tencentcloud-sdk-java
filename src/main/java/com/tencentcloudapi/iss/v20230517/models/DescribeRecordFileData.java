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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordFileData extends AbstractModel{

    /**
    * 提示类型，0:时间段内无归档录像，1:时间段内有归档录像
    */
    @SerializedName("Tips")
    @Expose
    private Long Tips;

    /**
    * 存在为数组格式，不存在字段内容为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private RecordTimeLine [] List;

    /**
     * Get 提示类型，0:时间段内无归档录像，1:时间段内有归档录像 
     * @return Tips 提示类型，0:时间段内无归档录像，1:时间段内有归档录像
     */
    public Long getTips() {
        return this.Tips;
    }

    /**
     * Set 提示类型，0:时间段内无归档录像，1:时间段内有归档录像
     * @param Tips 提示类型，0:时间段内无归档录像，1:时间段内有归档录像
     */
    public void setTips(Long Tips) {
        this.Tips = Tips;
    }

    /**
     * Get 存在为数组格式，不存在字段内容为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 存在为数组格式，不存在字段内容为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RecordTimeLine [] getList() {
        return this.List;
    }

    /**
     * Set 存在为数组格式，不存在字段内容为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 存在为数组格式，不存在字段内容为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(RecordTimeLine [] List) {
        this.List = List;
    }

    public DescribeRecordFileData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordFileData(DescribeRecordFileData source) {
        if (source.Tips != null) {
            this.Tips = new Long(source.Tips);
        }
        if (source.List != null) {
            this.List = new RecordTimeLine[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new RecordTimeLine(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tips", this.Tips);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

