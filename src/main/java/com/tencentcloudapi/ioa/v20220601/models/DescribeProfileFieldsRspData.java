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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProfileFieldsRspData extends AbstractModel {

    /**
    * <p>详情item</p>
    */
    @SerializedName("Item")
    @Expose
    private ProfileFieldItem [] Item;

    /**
    * <p>profile开关配置</p>
    */
    @SerializedName("ProfileTips")
    @Expose
    private ProfileTips ProfileTips;

    /**
     * Get <p>详情item</p> 
     * @return Item <p>详情item</p>
     */
    public ProfileFieldItem [] getItem() {
        return this.Item;
    }

    /**
     * Set <p>详情item</p>
     * @param Item <p>详情item</p>
     */
    public void setItem(ProfileFieldItem [] Item) {
        this.Item = Item;
    }

    /**
     * Get <p>profile开关配置</p> 
     * @return ProfileTips <p>profile开关配置</p>
     */
    public ProfileTips getProfileTips() {
        return this.ProfileTips;
    }

    /**
     * Set <p>profile开关配置</p>
     * @param ProfileTips <p>profile开关配置</p>
     */
    public void setProfileTips(ProfileTips ProfileTips) {
        this.ProfileTips = ProfileTips;
    }

    public DescribeProfileFieldsRspData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProfileFieldsRspData(DescribeProfileFieldsRspData source) {
        if (source.Item != null) {
            this.Item = new ProfileFieldItem[source.Item.length];
            for (int i = 0; i < source.Item.length; i++) {
                this.Item[i] = new ProfileFieldItem(source.Item[i]);
            }
        }
        if (source.ProfileTips != null) {
            this.ProfileTips = new ProfileTips(source.ProfileTips);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Item.", this.Item);
        this.setParamObj(map, prefix + "ProfileTips.", this.ProfileTips);

    }
}

