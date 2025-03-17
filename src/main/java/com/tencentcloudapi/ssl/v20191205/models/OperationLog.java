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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationLog extends AbstractModel {

    /**
    * 操作证书动作。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 操作时间。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 主账号
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子账号
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 证书ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 每个操作类型都对应一个具体的操作描述。以下是对每个操作类型及其描述的文字说明：
1. apply - 表示申请一个免费的证书。
2. delete - 表示删除操作。
3. download - 表示下载操作。
4. upload - 表示上传操作。
5. revoke - 表示吊销证书。
6. cancelRevoke - 表示取消吊销操作。
7. updateAlias - 表示更新备注信息。
8. changeProject - 表示将证书分配到某个项目。
9. uploadConfirmLetter - 表示上传确认函。
10. cancel - 表示取消订单操作。
11. replace - 表示重颁发证书。
12. downloadConfirmLetter - 表示下载证书吊销确认函。
13. editRevokeLetter - 表示上传证书吊销确认函。
14. renewVIP - 表示续费付费证书。
15. applyVIP - 表示申请付费证书。
16. submitInfo - 表示提交资料。
17. downloadConfirmLetter - 表示下载确认函模版。
18. uploadFromYunAPI - 表示通过云 API 上传。
19. transferIn - 表示证书转入操作。
20. transferOut - 表示证书转出操作。
21. refund - 表示申请退款。
22. multiYearsRenew - 表示多年期自动续期。
23. modifyDownloadLimit - 表示修改下载限制开关。
24. issued - 表示证书签发。
25. domainValidationPassed - 表示域名验证完成。
26. Resubmit - 表示证书重新申请。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 操作证书动作。 
     * @return Action 操作证书动作。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 操作证书动作。
     * @param Action 操作证书动作。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 操作时间。 
     * @return CreatedOn 操作时间。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 操作时间。
     * @param CreatedOn 操作时间。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 主账号 
     * @return Uin 主账号
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号
     * @param Uin 主账号
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子账号 
     * @return SubAccountUin 子账号
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 子账号
     * @param SubAccountUin 子账号
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 证书ID 
     * @return CertId 证书ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 证书ID
     * @param CertId 证书ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 每个操作类型都对应一个具体的操作描述。以下是对每个操作类型及其描述的文字说明：
1. apply - 表示申请一个免费的证书。
2. delete - 表示删除操作。
3. download - 表示下载操作。
4. upload - 表示上传操作。
5. revoke - 表示吊销证书。
6. cancelRevoke - 表示取消吊销操作。
7. updateAlias - 表示更新备注信息。
8. changeProject - 表示将证书分配到某个项目。
9. uploadConfirmLetter - 表示上传确认函。
10. cancel - 表示取消订单操作。
11. replace - 表示重颁发证书。
12. downloadConfirmLetter - 表示下载证书吊销确认函。
13. editRevokeLetter - 表示上传证书吊销确认函。
14. renewVIP - 表示续费付费证书。
15. applyVIP - 表示申请付费证书。
16. submitInfo - 表示提交资料。
17. downloadConfirmLetter - 表示下载确认函模版。
18. uploadFromYunAPI - 表示通过云 API 上传。
19. transferIn - 表示证书转入操作。
20. transferOut - 表示证书转出操作。
21. refund - 表示申请退款。
22. multiYearsRenew - 表示多年期自动续期。
23. modifyDownloadLimit - 表示修改下载限制开关。
24. issued - 表示证书签发。
25. domainValidationPassed - 表示域名验证完成。
26. Resubmit - 表示证书重新申请。 
     * @return Type 每个操作类型都对应一个具体的操作描述。以下是对每个操作类型及其描述的文字说明：
1. apply - 表示申请一个免费的证书。
2. delete - 表示删除操作。
3. download - 表示下载操作。
4. upload - 表示上传操作。
5. revoke - 表示吊销证书。
6. cancelRevoke - 表示取消吊销操作。
7. updateAlias - 表示更新备注信息。
8. changeProject - 表示将证书分配到某个项目。
9. uploadConfirmLetter - 表示上传确认函。
10. cancel - 表示取消订单操作。
11. replace - 表示重颁发证书。
12. downloadConfirmLetter - 表示下载证书吊销确认函。
13. editRevokeLetter - 表示上传证书吊销确认函。
14. renewVIP - 表示续费付费证书。
15. applyVIP - 表示申请付费证书。
16. submitInfo - 表示提交资料。
17. downloadConfirmLetter - 表示下载确认函模版。
18. uploadFromYunAPI - 表示通过云 API 上传。
19. transferIn - 表示证书转入操作。
20. transferOut - 表示证书转出操作。
21. refund - 表示申请退款。
22. multiYearsRenew - 表示多年期自动续期。
23. modifyDownloadLimit - 表示修改下载限制开关。
24. issued - 表示证书签发。
25. domainValidationPassed - 表示域名验证完成。
26. Resubmit - 表示证书重新申请。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 每个操作类型都对应一个具体的操作描述。以下是对每个操作类型及其描述的文字说明：
1. apply - 表示申请一个免费的证书。
2. delete - 表示删除操作。
3. download - 表示下载操作。
4. upload - 表示上传操作。
5. revoke - 表示吊销证书。
6. cancelRevoke - 表示取消吊销操作。
7. updateAlias - 表示更新备注信息。
8. changeProject - 表示将证书分配到某个项目。
9. uploadConfirmLetter - 表示上传确认函。
10. cancel - 表示取消订单操作。
11. replace - 表示重颁发证书。
12. downloadConfirmLetter - 表示下载证书吊销确认函。
13. editRevokeLetter - 表示上传证书吊销确认函。
14. renewVIP - 表示续费付费证书。
15. applyVIP - 表示申请付费证书。
16. submitInfo - 表示提交资料。
17. downloadConfirmLetter - 表示下载确认函模版。
18. uploadFromYunAPI - 表示通过云 API 上传。
19. transferIn - 表示证书转入操作。
20. transferOut - 表示证书转出操作。
21. refund - 表示申请退款。
22. multiYearsRenew - 表示多年期自动续期。
23. modifyDownloadLimit - 表示修改下载限制开关。
24. issued - 表示证书签发。
25. domainValidationPassed - 表示域名验证完成。
26. Resubmit - 表示证书重新申请。
     * @param Type 每个操作类型都对应一个具体的操作描述。以下是对每个操作类型及其描述的文字说明：
1. apply - 表示申请一个免费的证书。
2. delete - 表示删除操作。
3. download - 表示下载操作。
4. upload - 表示上传操作。
5. revoke - 表示吊销证书。
6. cancelRevoke - 表示取消吊销操作。
7. updateAlias - 表示更新备注信息。
8. changeProject - 表示将证书分配到某个项目。
9. uploadConfirmLetter - 表示上传确认函。
10. cancel - 表示取消订单操作。
11. replace - 表示重颁发证书。
12. downloadConfirmLetter - 表示下载证书吊销确认函。
13. editRevokeLetter - 表示上传证书吊销确认函。
14. renewVIP - 表示续费付费证书。
15. applyVIP - 表示申请付费证书。
16. submitInfo - 表示提交资料。
17. downloadConfirmLetter - 表示下载确认函模版。
18. uploadFromYunAPI - 表示通过云 API 上传。
19. transferIn - 表示证书转入操作。
20. transferOut - 表示证书转出操作。
21. refund - 表示申请退款。
22. multiYearsRenew - 表示多年期自动续期。
23. modifyDownloadLimit - 表示修改下载限制开关。
24. issued - 表示证书签发。
25. domainValidationPassed - 表示域名验证完成。
26. Resubmit - 表示证书重新申请。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public OperationLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperationLog(OperationLog source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

