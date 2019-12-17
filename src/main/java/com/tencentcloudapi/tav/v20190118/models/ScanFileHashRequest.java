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
package com.tencentcloudapi.tav.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanFileHashRequest extends AbstractModel{

    /**
    * 购买服务后获得的授权信息，用于保证请求有效性
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 需要查询的md5值（支持单个和多个，多个md5间用逗号分格）
    */
    @SerializedName("Md5s")
    @Expose
    private String Md5s;

    /**
    * 保留字段默认填0
    */
    @SerializedName("WithCategory")
    @Expose
    private String WithCategory;

    /**
    * 松严规则控制字段默认填10（5-松、10-标准、15-严）
    */
    @SerializedName("SensitiveLevel")
    @Expose
    private String SensitiveLevel;

    /**
     * Get 购买服务后获得的授权信息，用于保证请求有效性 
     * @return Key 购买服务后获得的授权信息，用于保证请求有效性
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 购买服务后获得的授权信息，用于保证请求有效性
     * @param Key 购买服务后获得的授权信息，用于保证请求有效性
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 需要查询的md5值（支持单个和多个，多个md5间用逗号分格） 
     * @return Md5s 需要查询的md5值（支持单个和多个，多个md5间用逗号分格）
     */
    public String getMd5s() {
        return this.Md5s;
    }

    /**
     * Set 需要查询的md5值（支持单个和多个，多个md5间用逗号分格）
     * @param Md5s 需要查询的md5值（支持单个和多个，多个md5间用逗号分格）
     */
    public void setMd5s(String Md5s) {
        this.Md5s = Md5s;
    }

    /**
     * Get 保留字段默认填0 
     * @return WithCategory 保留字段默认填0
     */
    public String getWithCategory() {
        return this.WithCategory;
    }

    /**
     * Set 保留字段默认填0
     * @param WithCategory 保留字段默认填0
     */
    public void setWithCategory(String WithCategory) {
        this.WithCategory = WithCategory;
    }

    /**
     * Get 松严规则控制字段默认填10（5-松、10-标准、15-严） 
     * @return SensitiveLevel 松严规则控制字段默认填10（5-松、10-标准、15-严）
     */
    public String getSensitiveLevel() {
        return this.SensitiveLevel;
    }

    /**
     * Set 松严规则控制字段默认填10（5-松、10-标准、15-严）
     * @param SensitiveLevel 松严规则控制字段默认填10（5-松、10-标准、15-严）
     */
    public void setSensitiveLevel(String SensitiveLevel) {
        this.SensitiveLevel = SensitiveLevel;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Md5s", this.Md5s);
        this.setParamSimple(map, prefix + "WithCategory", this.WithCategory);
        this.setParamSimple(map, prefix + "SensitiveLevel", this.SensitiveLevel);

    }
}

