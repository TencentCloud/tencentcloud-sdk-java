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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConditionMatch extends AbstractModel {

    /**
    * <p>镜像ID匹配串（三选一，有且仅有一个非空）</p>
    */
    @SerializedName("ImageIDMatchString")
    @Expose
    private String ImageIDMatchString;

    /**
    * <p>镜像名匹配串（三选一，有且仅有一个非空）</p>
    */
    @SerializedName("ImageNameMatchString")
    @Expose
    private String ImageNameMatchString;

    /**
    * <p>镜像地址匹配串（三选一，有且仅有一个非空）</p>
    */
    @SerializedName("ImageAddressMatchString")
    @Expose
    private String ImageAddressMatchString;

    /**
    * <p>匹配条件，取值：EQUALS-等于/NOT_EQUALS-不等于/STARTS_WITH-以…开头/NOT_STARTS_WITH-不以…开头/ENDS_WITH-以…结尾/NOT_ENDS_WITH-不以…结尾/CONTAINS-包含/NOT_CONTAINS-不包含</p>
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
     * Get <p>镜像ID匹配串（三选一，有且仅有一个非空）</p> 
     * @return ImageIDMatchString <p>镜像ID匹配串（三选一，有且仅有一个非空）</p>
     */
    public String getImageIDMatchString() {
        return this.ImageIDMatchString;
    }

    /**
     * Set <p>镜像ID匹配串（三选一，有且仅有一个非空）</p>
     * @param ImageIDMatchString <p>镜像ID匹配串（三选一，有且仅有一个非空）</p>
     */
    public void setImageIDMatchString(String ImageIDMatchString) {
        this.ImageIDMatchString = ImageIDMatchString;
    }

    /**
     * Get <p>镜像名匹配串（三选一，有且仅有一个非空）</p> 
     * @return ImageNameMatchString <p>镜像名匹配串（三选一，有且仅有一个非空）</p>
     */
    public String getImageNameMatchString() {
        return this.ImageNameMatchString;
    }

    /**
     * Set <p>镜像名匹配串（三选一，有且仅有一个非空）</p>
     * @param ImageNameMatchString <p>镜像名匹配串（三选一，有且仅有一个非空）</p>
     */
    public void setImageNameMatchString(String ImageNameMatchString) {
        this.ImageNameMatchString = ImageNameMatchString;
    }

    /**
     * Get <p>镜像地址匹配串（三选一，有且仅有一个非空）</p> 
     * @return ImageAddressMatchString <p>镜像地址匹配串（三选一，有且仅有一个非空）</p>
     */
    public String getImageAddressMatchString() {
        return this.ImageAddressMatchString;
    }

    /**
     * Set <p>镜像地址匹配串（三选一，有且仅有一个非空）</p>
     * @param ImageAddressMatchString <p>镜像地址匹配串（三选一，有且仅有一个非空）</p>
     */
    public void setImageAddressMatchString(String ImageAddressMatchString) {
        this.ImageAddressMatchString = ImageAddressMatchString;
    }

    /**
     * Get <p>匹配条件，取值：EQUALS-等于/NOT_EQUALS-不等于/STARTS_WITH-以…开头/NOT_STARTS_WITH-不以…开头/ENDS_WITH-以…结尾/NOT_ENDS_WITH-不以…结尾/CONTAINS-包含/NOT_CONTAINS-不包含</p> 
     * @return MatchType <p>匹配条件，取值：EQUALS-等于/NOT_EQUALS-不等于/STARTS_WITH-以…开头/NOT_STARTS_WITH-不以…开头/ENDS_WITH-以…结尾/NOT_ENDS_WITH-不以…结尾/CONTAINS-包含/NOT_CONTAINS-不包含</p>
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set <p>匹配条件，取值：EQUALS-等于/NOT_EQUALS-不等于/STARTS_WITH-以…开头/NOT_STARTS_WITH-不以…开头/ENDS_WITH-以…结尾/NOT_ENDS_WITH-不以…结尾/CONTAINS-包含/NOT_CONTAINS-不包含</p>
     * @param MatchType <p>匹配条件，取值：EQUALS-等于/NOT_EQUALS-不等于/STARTS_WITH-以…开头/NOT_STARTS_WITH-不以…开头/ENDS_WITH-以…结尾/NOT_ENDS_WITH-不以…结尾/CONTAINS-包含/NOT_CONTAINS-不包含</p>
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    public ConditionMatch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConditionMatch(ConditionMatch source) {
        if (source.ImageIDMatchString != null) {
            this.ImageIDMatchString = new String(source.ImageIDMatchString);
        }
        if (source.ImageNameMatchString != null) {
            this.ImageNameMatchString = new String(source.ImageNameMatchString);
        }
        if (source.ImageAddressMatchString != null) {
            this.ImageAddressMatchString = new String(source.ImageAddressMatchString);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageIDMatchString", this.ImageIDMatchString);
        this.setParamSimple(map, prefix + "ImageNameMatchString", this.ImageNameMatchString);
        this.setParamSimple(map, prefix + "ImageAddressMatchString", this.ImageAddressMatchString);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);

    }
}

