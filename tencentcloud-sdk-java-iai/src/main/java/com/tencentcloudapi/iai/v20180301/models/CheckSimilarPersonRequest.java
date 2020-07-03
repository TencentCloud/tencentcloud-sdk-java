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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckSimilarPersonRequest extends AbstractModel{

    /**
    * 待整理的人员库列表。 
人员库总人数不可超过200万，人员库个数不可超过10个。
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * 人员查重整理力度的控制。
1：力度较高的档案整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
2：力度较低的档案整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
    */
    @SerializedName("UniquePersonControl")
    @Expose
    private Long UniquePersonControl;

    /**
     * Get 待整理的人员库列表。 
人员库总人数不可超过200万，人员库个数不可超过10个。 
     * @return GroupIds 待整理的人员库列表。 
人员库总人数不可超过200万，人员库个数不可超过10个。
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 待整理的人员库列表。 
人员库总人数不可超过200万，人员库个数不可超过10个。
     * @param GroupIds 待整理的人员库列表。 
人员库总人数不可超过200万，人员库个数不可超过10个。
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 人员查重整理力度的控制。
1：力度较高的档案整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
2：力度较低的档案整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。 
     * @return UniquePersonControl 人员查重整理力度的控制。
1：力度较高的档案整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
2：力度较低的档案整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
     */
    public Long getUniquePersonControl() {
        return this.UniquePersonControl;
    }

    /**
     * Set 人员查重整理力度的控制。
1：力度较高的档案整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
2：力度较低的档案整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
     * @param UniquePersonControl 人员查重整理力度的控制。
1：力度较高的档案整理，能够消除更多的重复身份，对应稍高的非重复身份误清除率；
2：力度较低的档案整理，非重复身份的误清除率较低，对应稍低的重复身份消除率。
     */
    public void setUniquePersonControl(Long UniquePersonControl) {
        this.UniquePersonControl = UniquePersonControl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "UniquePersonControl", this.UniquePersonControl);

    }
}

