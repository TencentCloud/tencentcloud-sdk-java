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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosInfo extends AbstractModel{

    /**
    * cos 区域值。例如：ap-beijing。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * cos 存储桶，格式为BuketName-AppId。例如：test-123456。
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * cos 路径。 
对于写表示目录，例如：/test； 
对于读表示文件路径，例如：/test/test.mp4。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * cos 授权信息，不填默认为公有权限。
    */
    @SerializedName("CosAuthMode")
    @Expose
    private CosAuthMode CosAuthMode;

    /**
     * Get cos 区域值。例如：ap-beijing。 
     * @return Region cos 区域值。例如：ap-beijing。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set cos 区域值。例如：ap-beijing。
     * @param Region cos 区域值。例如：ap-beijing。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get cos 存储桶，格式为BuketName-AppId。例如：test-123456。 
     * @return Bucket cos 存储桶，格式为BuketName-AppId。例如：test-123456。
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set cos 存储桶，格式为BuketName-AppId。例如：test-123456。
     * @param Bucket cos 存储桶，格式为BuketName-AppId。例如：test-123456。
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get cos 路径。 
对于写表示目录，例如：/test； 
对于读表示文件路径，例如：/test/test.mp4。 
     * @return Path cos 路径。 
对于写表示目录，例如：/test； 
对于读表示文件路径，例如：/test/test.mp4。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set cos 路径。 
对于写表示目录，例如：/test； 
对于读表示文件路径，例如：/test/test.mp4。
     * @param Path cos 路径。 
对于写表示目录，例如：/test； 
对于读表示文件路径，例如：/test/test.mp4。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get cos 授权信息，不填默认为公有权限。 
     * @return CosAuthMode cos 授权信息，不填默认为公有权限。
     */
    public CosAuthMode getCosAuthMode() {
        return this.CosAuthMode;
    }

    /**
     * Set cos 授权信息，不填默认为公有权限。
     * @param CosAuthMode cos 授权信息，不填默认为公有权限。
     */
    public void setCosAuthMode(CosAuthMode CosAuthMode) {
        this.CosAuthMode = CosAuthMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "CosAuthMode.", this.CosAuthMode);

    }
}

