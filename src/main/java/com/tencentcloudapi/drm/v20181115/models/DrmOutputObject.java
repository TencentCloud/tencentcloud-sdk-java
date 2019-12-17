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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrmOutputObject extends AbstractModel{

    /**
    * 输出的桶名称。
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 输出的对象名称。
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * 输出对象参数。
    */
    @SerializedName("Para")
    @Expose
    private DrmOutputPara Para;

    /**
     * Get 输出的桶名称。 
     * @return BucketName 输出的桶名称。
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 输出的桶名称。
     * @param BucketName 输出的桶名称。
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 输出的对象名称。 
     * @return ObjectName 输出的对象名称。
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set 输出的对象名称。
     * @param ObjectName 输出的对象名称。
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get 输出对象参数。 
     * @return Para 输出对象参数。
     */
    public DrmOutputPara getPara() {
        return this.Para;
    }

    /**
     * Set 输出对象参数。
     * @param Para 输出对象参数。
     */
    public void setPara(DrmOutputPara Para) {
        this.Para = Para;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "ObjectName", this.ObjectName);
        this.setParamObj(map, prefix + "Para.", this.Para);

    }
}

