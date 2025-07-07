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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddShareUnitRequest extends AbstractModel {

    /**
    * 共享单元名称。仅支持大小写字母、数字、-、以及_的组合，3-128个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 共享单元地域。可通过接口[DescribeShareAreas](https://cloud.tencent.com/document/product/850/103050)获取支持共享的地域。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 共享单元描述。最大128个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号，默认值：1
    */
    @SerializedName("ShareScope")
    @Expose
    private Long ShareScope;

    /**
     * Get 共享单元名称。仅支持大小写字母、数字、-、以及_的组合，3-128个字符。 
     * @return Name 共享单元名称。仅支持大小写字母、数字、-、以及_的组合，3-128个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 共享单元名称。仅支持大小写字母、数字、-、以及_的组合，3-128个字符。
     * @param Name 共享单元名称。仅支持大小写字母、数字、-、以及_的组合，3-128个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 共享单元地域。可通过接口[DescribeShareAreas](https://cloud.tencent.com/document/product/850/103050)获取支持共享的地域。 
     * @return Area 共享单元地域。可通过接口[DescribeShareAreas](https://cloud.tencent.com/document/product/850/103050)获取支持共享的地域。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 共享单元地域。可通过接口[DescribeShareAreas](https://cloud.tencent.com/document/product/850/103050)获取支持共享的地域。
     * @param Area 共享单元地域。可通过接口[DescribeShareAreas](https://cloud.tencent.com/document/product/850/103050)获取支持共享的地域。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 共享单元描述。最大128个字符。 
     * @return Description 共享单元描述。最大128个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 共享单元描述。最大128个字符。
     * @param Description 共享单元描述。最大128个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号，默认值：1 
     * @return ShareScope 共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号，默认值：1
     */
    public Long getShareScope() {
        return this.ShareScope;
    }

    /**
     * Set 共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号，默认值：1
     * @param ShareScope 共享范围。取值：1-仅允许集团组织内共享 2-允许共享给任意账号，默认值：1
     */
    public void setShareScope(Long ShareScope) {
        this.ShareScope = ShareScope;
    }

    public AddShareUnitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddShareUnitRequest(AddShareUnitRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ShareScope != null) {
            this.ShareScope = new Long(source.ShareScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ShareScope", this.ShareScope);

    }
}

