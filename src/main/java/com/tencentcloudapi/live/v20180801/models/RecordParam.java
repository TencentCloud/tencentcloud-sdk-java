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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordParam extends AbstractModel {

    /**
    * 录制间隔。
单位秒，默认：1800。
取值范围：30-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
    */
    @SerializedName("RecordInterval")
    @Expose
    private Long RecordInterval;

    /**
    * 录制存储时长。
单位秒，取值范围： 0 - 1500天。
0：表示永久存储。
    */
    @SerializedName("StorageTime")
    @Expose
    private Long StorageTime;

    /**
    * 是否开启当前格式录制，默认值为0，0：否， 1：是。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 点播子应用 ID。
    */
    @SerializedName("VodSubAppId")
    @Expose
    private Long VodSubAppId;

    /**
    * 录制文件名。
支持的特殊占位符有：
{StreamID}: 流ID
{StartYear}: 开始时间-年
{StartMonth}: 开始时间-月
{StartDay}: 开始时间-日
{StartHour}: 开始时间-小时
{StartMinute}: 开始时间-分钟
{StartSecond}: 开始时间-秒
{StartMillisecond}: 开始时间-毫秒
{EndYear}: 结束时间-年
{EndMonth}: 结束时间-月
{EndDay}: 结束时间-日
{EndHour}: 结束时间-小时
{EndMinute}: 结束时间-分钟
{EndSecond}: 结束时间-秒
{EndMillisecond}: 结束时间-毫秒

若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}
    */
    @SerializedName("VodFileName")
    @Expose
    private String VodFileName;

    /**
    * 任务流
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Procedure")
    @Expose
    private String Procedure;

    /**
    * 视频存储策略。
normal：标准存储。
cold：低频存储。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageMode")
    @Expose
    private String StorageMode;

    /**
    * 点播应用分类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassId")
    @Expose
    private Long ClassId;

    /**
    * 存储至 cos 的 bucket 桶名称。
注：CosBucketName参数值不能包含-[appid] 部分。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 存储至 cos 的 bucket 区域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketRegion")
    @Expose
    private String CosBucketRegion;

    /**
    * 存储至 cos 的 bucket 路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketPath")
    @Expose
    private String CosBucketPath;

    /**
     * Get 录制间隔。
单位秒，默认：1800。
取值范围：30-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。 
     * @return RecordInterval 录制间隔。
单位秒，默认：1800。
取值范围：30-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
     */
    public Long getRecordInterval() {
        return this.RecordInterval;
    }

    /**
     * Set 录制间隔。
单位秒，默认：1800。
取值范围：30-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
     * @param RecordInterval 录制间隔。
单位秒，默认：1800。
取值范围：30-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
     */
    public void setRecordInterval(Long RecordInterval) {
        this.RecordInterval = RecordInterval;
    }

    /**
     * Get 录制存储时长。
单位秒，取值范围： 0 - 1500天。
0：表示永久存储。 
     * @return StorageTime 录制存储时长。
单位秒，取值范围： 0 - 1500天。
0：表示永久存储。
     */
    public Long getStorageTime() {
        return this.StorageTime;
    }

    /**
     * Set 录制存储时长。
单位秒，取值范围： 0 - 1500天。
0：表示永久存储。
     * @param StorageTime 录制存储时长。
单位秒，取值范围： 0 - 1500天。
0：表示永久存储。
     */
    public void setStorageTime(Long StorageTime) {
        this.StorageTime = StorageTime;
    }

    /**
     * Get 是否开启当前格式录制，默认值为0，0：否， 1：是。 
     * @return Enable 是否开启当前格式录制，默认值为0，0：否， 1：是。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否开启当前格式录制，默认值为0，0：否， 1：是。
     * @param Enable 是否开启当前格式录制，默认值为0，0：否， 1：是。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 点播子应用 ID。 
     * @return VodSubAppId 点播子应用 ID。
     */
    public Long getVodSubAppId() {
        return this.VodSubAppId;
    }

    /**
     * Set 点播子应用 ID。
     * @param VodSubAppId 点播子应用 ID。
     */
    public void setVodSubAppId(Long VodSubAppId) {
        this.VodSubAppId = VodSubAppId;
    }

    /**
     * Get 录制文件名。
支持的特殊占位符有：
{StreamID}: 流ID
{StartYear}: 开始时间-年
{StartMonth}: 开始时间-月
{StartDay}: 开始时间-日
{StartHour}: 开始时间-小时
{StartMinute}: 开始时间-分钟
{StartSecond}: 开始时间-秒
{StartMillisecond}: 开始时间-毫秒
{EndYear}: 结束时间-年
{EndMonth}: 结束时间-月
{EndDay}: 结束时间-日
{EndHour}: 结束时间-小时
{EndMinute}: 结束时间-分钟
{EndSecond}: 结束时间-秒
{EndMillisecond}: 结束时间-毫秒

若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond} 
     * @return VodFileName 录制文件名。
支持的特殊占位符有：
{StreamID}: 流ID
{StartYear}: 开始时间-年
{StartMonth}: 开始时间-月
{StartDay}: 开始时间-日
{StartHour}: 开始时间-小时
{StartMinute}: 开始时间-分钟
{StartSecond}: 开始时间-秒
{StartMillisecond}: 开始时间-毫秒
{EndYear}: 结束时间-年
{EndMonth}: 结束时间-月
{EndDay}: 结束时间-日
{EndHour}: 结束时间-小时
{EndMinute}: 结束时间-分钟
{EndSecond}: 结束时间-秒
{EndMillisecond}: 结束时间-毫秒

若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}
     */
    public String getVodFileName() {
        return this.VodFileName;
    }

    /**
     * Set 录制文件名。
支持的特殊占位符有：
{StreamID}: 流ID
{StartYear}: 开始时间-年
{StartMonth}: 开始时间-月
{StartDay}: 开始时间-日
{StartHour}: 开始时间-小时
{StartMinute}: 开始时间-分钟
{StartSecond}: 开始时间-秒
{StartMillisecond}: 开始时间-毫秒
{EndYear}: 结束时间-年
{EndMonth}: 结束时间-月
{EndDay}: 结束时间-日
{EndHour}: 结束时间-小时
{EndMinute}: 结束时间-分钟
{EndSecond}: 结束时间-秒
{EndMillisecond}: 结束时间-毫秒

若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}
     * @param VodFileName 录制文件名。
支持的特殊占位符有：
{StreamID}: 流ID
{StartYear}: 开始时间-年
{StartMonth}: 开始时间-月
{StartDay}: 开始时间-日
{StartHour}: 开始时间-小时
{StartMinute}: 开始时间-分钟
{StartSecond}: 开始时间-秒
{StartMillisecond}: 开始时间-毫秒
{EndYear}: 结束时间-年
{EndMonth}: 结束时间-月
{EndDay}: 结束时间-日
{EndHour}: 结束时间-小时
{EndMinute}: 结束时间-分钟
{EndSecond}: 结束时间-秒
{EndMillisecond}: 结束时间-毫秒

若未设置默认录制文件名为{StreamID}_{StartYear}-{StartMonth}-{StartDay}-{StartHour}-{StartMinute}-{StartSecond}_{EndYear}-{EndMonth}-{EndDay}-{EndHour}-{EndMinute}-{EndSecond}
     */
    public void setVodFileName(String VodFileName) {
        this.VodFileName = VodFileName;
    }

    /**
     * Get 任务流
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Procedure 任务流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcedure() {
        return this.Procedure;
    }

    /**
     * Set 任务流
注意：此字段可能返回 null，表示取不到有效值。
     * @param Procedure 任务流
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcedure(String Procedure) {
        this.Procedure = Procedure;
    }

    /**
     * Get 视频存储策略。
normal：标准存储。
cold：低频存储。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageMode 视频存储策略。
normal：标准存储。
cold：低频存储。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageMode() {
        return this.StorageMode;
    }

    /**
     * Set 视频存储策略。
normal：标准存储。
cold：低频存储。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageMode 视频存储策略。
normal：标准存储。
cold：低频存储。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageMode(String StorageMode) {
        this.StorageMode = StorageMode;
    }

    /**
     * Get 点播应用分类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassId 点播应用分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClassId() {
        return this.ClassId;
    }

    /**
     * Set 点播应用分类
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassId 点播应用分类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassId(Long ClassId) {
        this.ClassId = ClassId;
    }

    /**
     * Get 存储至 cos 的 bucket 桶名称。
注：CosBucketName参数值不能包含-[appid] 部分。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketName 存储至 cos 的 bucket 桶名称。
注：CosBucketName参数值不能包含-[appid] 部分。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set 存储至 cos 的 bucket 桶名称。
注：CosBucketName参数值不能包含-[appid] 部分。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketName 存储至 cos 的 bucket 桶名称。
注：CosBucketName参数值不能包含-[appid] 部分。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get 存储至 cos 的 bucket 区域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketRegion 存储至 cos 的 bucket 区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucketRegion() {
        return this.CosBucketRegion;
    }

    /**
     * Set 存储至 cos 的 bucket 区域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketRegion 存储至 cos 的 bucket 区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketRegion(String CosBucketRegion) {
        this.CosBucketRegion = CosBucketRegion;
    }

    /**
     * Get 存储至 cos 的 bucket 路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketPath 存储至 cos 的 bucket 路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucketPath() {
        return this.CosBucketPath;
    }

    /**
     * Set 存储至 cos 的 bucket 路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketPath 存储至 cos 的 bucket 路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketPath(String CosBucketPath) {
        this.CosBucketPath = CosBucketPath;
    }

    public RecordParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordParam(RecordParam source) {
        if (source.RecordInterval != null) {
            this.RecordInterval = new Long(source.RecordInterval);
        }
        if (source.StorageTime != null) {
            this.StorageTime = new Long(source.StorageTime);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.VodSubAppId != null) {
            this.VodSubAppId = new Long(source.VodSubAppId);
        }
        if (source.VodFileName != null) {
            this.VodFileName = new String(source.VodFileName);
        }
        if (source.Procedure != null) {
            this.Procedure = new String(source.Procedure);
        }
        if (source.StorageMode != null) {
            this.StorageMode = new String(source.StorageMode);
        }
        if (source.ClassId != null) {
            this.ClassId = new Long(source.ClassId);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.CosBucketRegion != null) {
            this.CosBucketRegion = new String(source.CosBucketRegion);
        }
        if (source.CosBucketPath != null) {
            this.CosBucketPath = new String(source.CosBucketPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordInterval", this.RecordInterval);
        this.setParamSimple(map, prefix + "StorageTime", this.StorageTime);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "VodSubAppId", this.VodSubAppId);
        this.setParamSimple(map, prefix + "VodFileName", this.VodFileName);
        this.setParamSimple(map, prefix + "Procedure", this.Procedure);
        this.setParamSimple(map, prefix + "StorageMode", this.StorageMode);
        this.setParamSimple(map, prefix + "ClassId", this.ClassId);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "CosBucketRegion", this.CosBucketRegion);
        this.setParamSimple(map, prefix + "CosBucketPath", this.CosBucketPath);

    }
}

