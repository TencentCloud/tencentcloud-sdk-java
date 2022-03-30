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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckSimilarPersonRequest extends AbstractModel{

    /**
    * 待整理的人员库列表。 
人员库总人数不可超过200万，人员库个数不可超过10个。
数组元素取值为创建人员库接口中的GroupId
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * 人员查重整理力度的控制。
1：力度较高的人员整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
2：力度较低的人员整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
    */
    @SerializedName("UniquePersonControl")
    @Expose
    private Long UniquePersonControl;

    /**
     * Get 待整理的人员库列表。 
人员库总人数不可超过200万，人员库个数不可超过10个。
数组元素取值为创建人员库接口中的GroupId 
     * @return GroupIds 待整理的人员库列表。 
人员库总人数不可超过200万，人员库个数不可超过10个。
数组元素取值为创建人员库接口中的GroupId
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 待整理的人员库列表。 
人员库总人数不可超过200万，人员库个数不可超过10个。
数组元素取值为创建人员库接口中的GroupId
     * @param GroupIds 待整理的人员库列表。 
人员库总人数不可超过200万，人员库个数不可超过10个。
数组元素取值为创建人员库接口中的GroupId
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 人员查重整理力度的控制。
1：力度较高的人员整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
2：力度较低的人员整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。 
     * @return UniquePersonControl 人员查重整理力度的控制。
1：力度较高的人员整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
2：力度较低的人员整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
     */
    public Long getUniquePersonControl() {
        return this.UniquePersonControl;
    }

    /**
     * Set 人员查重整理力度的控制。
1：力度较高的人员整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
2：力度较低的人员整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
     * @param UniquePersonControl 人员查重整理力度的控制。
1：力度较高的人员整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
2：力度较低的人员整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
     */
    public void setUniquePersonControl(Long UniquePersonControl) {
        this.UniquePersonControl = UniquePersonControl;
    }

    public CheckSimilarPersonRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckSimilarPersonRequest(CheckSimilarPersonRequest source) {
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.UniquePersonControl != null) {
            this.UniquePersonControl = new Long(source.UniquePersonControl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "UniquePersonControl", this.UniquePersonControl);

    }
}

