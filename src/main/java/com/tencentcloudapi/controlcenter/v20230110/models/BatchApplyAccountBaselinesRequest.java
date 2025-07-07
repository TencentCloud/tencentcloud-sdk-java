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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchApplyAccountBaselinesRequest extends AbstractModel {

    /**
    * 成员账号uin，也是被应用基线的账号uin。
    */
    @SerializedName("MemberUinList")
    @Expose
    private Long [] MemberUinList;

    /**
    * 基线项配置信息列表。
    */
    @SerializedName("BaselineConfigItems")
    @Expose
    private BaselineConfigItem [] BaselineConfigItems;

    /**
     * Get 成员账号uin，也是被应用基线的账号uin。 
     * @return MemberUinList 成员账号uin，也是被应用基线的账号uin。
     */
    public Long [] getMemberUinList() {
        return this.MemberUinList;
    }

    /**
     * Set 成员账号uin，也是被应用基线的账号uin。
     * @param MemberUinList 成员账号uin，也是被应用基线的账号uin。
     */
    public void setMemberUinList(Long [] MemberUinList) {
        this.MemberUinList = MemberUinList;
    }

    /**
     * Get 基线项配置信息列表。 
     * @return BaselineConfigItems 基线项配置信息列表。
     */
    public BaselineConfigItem [] getBaselineConfigItems() {
        return this.BaselineConfigItems;
    }

    /**
     * Set 基线项配置信息列表。
     * @param BaselineConfigItems 基线项配置信息列表。
     */
    public void setBaselineConfigItems(BaselineConfigItem [] BaselineConfigItems) {
        this.BaselineConfigItems = BaselineConfigItems;
    }

    public BatchApplyAccountBaselinesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchApplyAccountBaselinesRequest(BatchApplyAccountBaselinesRequest source) {
        if (source.MemberUinList != null) {
            this.MemberUinList = new Long[source.MemberUinList.length];
            for (int i = 0; i < source.MemberUinList.length; i++) {
                this.MemberUinList[i] = new Long(source.MemberUinList[i]);
            }
        }
        if (source.BaselineConfigItems != null) {
            this.BaselineConfigItems = new BaselineConfigItem[source.BaselineConfigItems.length];
            for (int i = 0; i < source.BaselineConfigItems.length; i++) {
                this.BaselineConfigItems[i] = new BaselineConfigItem(source.BaselineConfigItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberUinList.", this.MemberUinList);
        this.setParamArrayObj(map, prefix + "BaselineConfigItems.", this.BaselineConfigItems);

    }
}

